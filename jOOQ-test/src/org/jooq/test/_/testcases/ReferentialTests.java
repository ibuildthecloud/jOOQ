/**
 * Copyright (c) 2009-2013, Data Geekery GmbH (http://www.datageekery.com)
 * All rights reserved.
 *
 * This work is dual-licensed
 * - under the Apache Software License 2.0 (the "ASL")
 * - under the jOOQ License and Maintenance Agreement (the "jOOQ License")
 * =============================================================================
 * You may choose which license applies to you:
 *
 * - If you're using this work with Open Source databases, you may choose
 *   either ASL or jOOQ License.
 * - If you're using this work with at least one commercial database, you must
 *   choose jOOQ License
 *
 * For more information, please visit http://www.jooq.org/licenses
 *
 * Apache Software License 2.0:
 * -----------------------------------------------------------------------------
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * jOOQ License and Maintenance Agreement:
 * -----------------------------------------------------------------------------
 * Data Geekery grants the Customer the non-exclusive, timely limited and
 * non-transferable license to install and use the Software under the terms of
 * the jOOQ License and Maintenance Agreement.
 *
 * This library is distributed with a LIMITED WARRANTY. See the jOOQ License
 * and Maintenance Agreement for more details: http://www.jooq.org/licensing
 */
package org.jooq.test._.testcases;

import static java.util.Arrays.asList;
import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertNull;

import java.sql.Date;

import org.jooq.Record1;
import org.jooq.Record2;
import org.jooq.Record3;
import org.jooq.Record6;
import org.jooq.Result;
import org.jooq.TableRecord;
import org.jooq.UpdatableRecord;
import org.jooq.test.BaseTest;
import org.jooq.test.jOOQAbstractTest;

import org.junit.Test;

public class ReferentialTests<
    A    extends UpdatableRecord<A> & Record6<Integer, String, String, Date, Integer, ?>,
    AP,
    B    extends UpdatableRecord<B>,
    S    extends UpdatableRecord<S> & Record1<String>,
    B2S  extends UpdatableRecord<B2S> & Record3<String, Integer, Integer>,
    BS   extends UpdatableRecord<BS>,
    L    extends TableRecord<L> & Record2<String, String>,
    X    extends TableRecord<X>,
    DATE extends UpdatableRecord<DATE>,
    BOOL extends UpdatableRecord<BOOL>,
    D    extends UpdatableRecord<D>,
    T    extends UpdatableRecord<T>,
    U    extends TableRecord<U>,
    UU   extends UpdatableRecord<UU>,
    I    extends TableRecord<I>,
    IPK  extends UpdatableRecord<IPK>,
    T725 extends UpdatableRecord<T725>,
    T639 extends UpdatableRecord<T639>,
    T785 extends TableRecord<T785>,
    CASE extends UpdatableRecord<CASE>>
extends BaseTest<A, AP, B, S, B2S, BS, L, X, DATE, BOOL, D, T, U, UU, I, IPK, T725, T639, T785, CASE> {

    public ReferentialTests(jOOQAbstractTest<A, AP, B, S, B2S, BS, L, X, DATE, BOOL, D, T, U, UU, I, IPK, T725, T639, T785, CASE> delegate) {
        super(delegate);
    }

    @SuppressWarnings("unchecked")
    @Test
    public void testFetchParentAndChildren() throws Exception {
        Result<A> authors = create().selectFrom(TAuthor()).orderBy(TAuthor_ID()).fetch();
        Result<B> books = create().selectFrom(TBook()).orderBy(TBook_ID()).fetch();

        A a1 = authors.get(0);
        A a2 = authors.get(1);
        B b1 = books.get(0);
        B b2 = books.get(1);
        B b3 = books.get(2);
        B b4 = books.get(3);

        // Fetching parents
        assertEquals(a1, b1.fetchParent(FK_T_BOOK_AUTHOR_ID()));
        assertEquals(a1, FK_T_BOOK_AUTHOR_ID().fetchParent(b1));
        assertSame(asList(a1), FK_T_BOOK_AUTHOR_ID().fetchParents(b1, b2));
        assertSame(asList(a1, a2), FK_T_BOOK_AUTHOR_ID().fetchParents(b1, b3));
        assertSame(asList(a1, a2), FK_T_BOOK_AUTHOR_ID().fetchParents(b1, b2, b3, b4));

        // Fetching children
        assertSame(asList(b1, b2), a1.fetchChildren(FK_T_BOOK_AUTHOR_ID()));
        assertSame(asList(b1, b2), FK_T_BOOK_AUTHOR_ID().fetchChildren(a1));
        assertSame(asList(b3, b4), a2.fetchChildren(FK_T_BOOK_AUTHOR_ID()));
        assertSame(asList(b3, b4), FK_T_BOOK_AUTHOR_ID().fetchChildren(a2));
        assertSame(asList(b1, b2, b3, b4), FK_T_BOOK_AUTHOR_ID().fetchChildren(a1, a2));

        // No co-authors available
        assertNull(b1.fetchParent(FK_T_BOOK_CO_AUTHOR_ID()));
        assertNull(a1.fetchChild(FK_T_BOOK_CO_AUTHOR_ID()));
    }
}
