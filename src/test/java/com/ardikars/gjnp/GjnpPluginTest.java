/**
 * Copyright 2018 the original author or authors.
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

package com.ardikars.gjnp;

import com.ardikars.gjnp.util.StringJoiner;
import org.gradle.api.Project;
import org.gradle.testfixtures.ProjectBuilder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;

@RunWith(JUnit4.class)
public class GjnpPluginTest {

    @Test
    public void init() {
        Project project = ProjectBuilder.builder().build();
        project.getPluginManager().apply("gjnp");

        assertTrue(project.getPluginManager()
                .hasPlugin("gjnp"));
    }

    @Test
    public void test() {
        List<String> strings = new ArrayList<>();
        strings.add("Stat");
        strings.add("Us");
        strings.add("IS");
        StringJoiner joiner = new StringJoiner(";");
        assertEquals("Stat;Us;IS", joiner.join(strings));
    }

}
