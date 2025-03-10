/*
 * Copyright 2008-present MongoDB, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.mongodb.client.model;

/**
 * Units for specifying time-based bounds for {@linkplain Window windows} and output units for some time-based
 * {@linkplain WindowedComputation windowed computations}.
 *
 * @mongodb.server.release 5.0
 * @since 4.3
 */
public enum MongoTimeUnit {
    /**
     * YEAR
     */
    YEAR("year", false),
    /**
     * QUARTER
     */
    QUARTER("quarter", false),
    /**
     * MONTH
     */
    MONTH("month", false),
    /**
     * WEEK
     */
    WEEK("week", true),
    /**
     * DAY
     */
    DAY("day", true),
    /**
     * HOUR
     */
    HOUR("hour", true),
    /**
     * MINUTE
     */
    MINUTE("minute", true),
    /**
     * SECOND
     */
    SECOND("second", true),
    /**
     * MILLISECOND
     */
    MILLISECOND("millisecond", true);

    private final String value;
    private final boolean fixed;

    MongoTimeUnit(final String value, final boolean fixed) {
        this.value = value;
        this.fixed = fixed;
    }

    String value() {
        return value;
    }

    /**
     * Returns {@code true} iff the unit represents a fixed duration.
     * E.g., a minute is a fixed duration equal to 60_000 milliseconds, while the duration of a month varies.
     */
    boolean fixed() {
        return fixed;
    }
}
