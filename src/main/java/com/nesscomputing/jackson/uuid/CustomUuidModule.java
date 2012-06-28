/**
 * Copyright (C) 2012 Ness Computing, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.nesscomputing.jackson.uuid;

import java.util.UUID;

import org.codehaus.jackson.Version;
import org.codehaus.jackson.map.JsonDeserializer;
import org.codehaus.jackson.map.module.SimpleModule;

import com.google.inject.Inject;

public class CustomUuidModule extends SimpleModule
{
    @Inject
    public CustomUuidModule(JsonDeserializer<UUID> d) {
        super("CustomUuidModule", new Version(1, 0, 0, null));
        addDeserializer(UUID.class, d);
    }
}

