/*
 * Copyright (C) 2008 The Android Open Source Project
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

package com.android.ddmuilib.location;

import com.android.ddmuilib.location.GpxParser.Track;

import org.eclipse.jface.viewers.IStructuredContentProvider;
import org.eclipse.jface.viewers.Viewer;

/**
 * Content provider to display {@link Track} objects in a Table.
 * <p/>The expected type for the input is {@link Track}<code>[]</code>.
 */
public class TrackContentProvider implements IStructuredContentProvider {

    @Override
    public Object[] getElements(Object inputElement) {
        if (inputElement instanceof Track[]) {
            return (Track[])inputElement;
        }

        return new Object[0];
    }

    @Override
    public void dispose() {
        // pass
    }

    @Override
    public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
        // pass
    }
}
