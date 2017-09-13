/*
 * Copyright 2013-2017 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.cloudfoundry.operations.applications;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.cloudfoundry.Nullable;
import org.immutables.value.Value;

/**
 * Domain object representation
 */
@Value.Immutable
abstract class _Docker {

    /**
     * The id of the domain
     */
    @JsonProperty("image")
    @Nullable
    abstract String getImage();

    /**
     * The name of the domain
     */
    @JsonProperty("username")
    @Nullable
    abstract String getUsername();

    /**
     * The type of the domain
     */
    @JsonProperty("password") //TODO: Validate!!!
    @Nullable
    abstract String getPassword();

}
