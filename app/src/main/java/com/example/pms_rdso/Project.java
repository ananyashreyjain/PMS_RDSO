/*
 * Copyright (C) 2016 The Android Open Source Project
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
package com.example.pms_rdso;

/**
 * {@link Project} represents a vocabulary word that the user wants to learn.
 * It contains a default translation, a Miwok translation, and an image for that word.
 */
public class Project {

    /** Miwok translation for the word */
    private String mProjectName;

    /**
     * Create a new Project object.
     * @param projectName is the word in the Miwok language
     */
    public Project(String projectName) {
        mProjectName = projectName;
    }

    /**
     * Get the Miwok translation of the word.
     */
    public String getProjectName() {
        return mProjectName;
    }

}