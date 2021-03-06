/*
 * Copyright 2007-2012 the original author or authors.
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
package org.springbyexample.web.json.service.person;

import org.springbyexample.web.service.person.PersonControllerTest;
import org.springframework.test.context.ActiveProfiles;

/**
 * Tests person controller with JSON serialization.
 * 
 * @author David Winterfeldt
 */
@ActiveProfiles(profiles= { "rest-json" }, inheritProfiles=true)
public class PersonControllerJsonIT extends PersonControllerTest {
    
}
