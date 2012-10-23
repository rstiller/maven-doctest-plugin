/**
 * Copyright 2012 the contributors
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */
package com.github.mavenplugins.doctest;

import org.apache.http.HttpResponse;
import org.junit.runner.RunWith;

import com.github.mavenplugins.doctest.expectations.ExpectStatus;

@RunWith(DoctestRunner.class)
public class RedirectDoctest {
    
    /**
     * Expects a redirect - normally the HTTP Client would follow the redirect and pass the result to this method.
     */
    @SimpleDoctest("http://localhost:12345/redirect")
    @DoctestClient(handleRedirects = false)
    @ExpectStatus(302)
    public void redirect(HttpResponse response) throws Exception {
    }
    
}
