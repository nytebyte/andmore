/*
 * Copyright (C) 2010 The Android Open Source Project
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

package com.android.hierarchyviewerlib.actions;

import com.android.hierarchyviewerlib.models.PixelPerfectModel;
import com.android.hierarchyviewerlib.models.PixelPerfectModel.IImageChangeListener;

import org.eclipse.jface.action.Action;
import org.eclipse.swt.widgets.Display;

public class PixelPerfectEnabledAction extends Action implements IImageChangeListener {
    public PixelPerfectEnabledAction(String name) {
        super(name);
        setEnabled(PixelPerfectModel.getModel().getImage() != null);
        PixelPerfectModel.getModel().addImageChangeListener(this);
    }

    public PixelPerfectEnabledAction(String name, int type) {
        super(name, type);
        setEnabled(PixelPerfectModel.getModel().getImage() != null);
        PixelPerfectModel.getModel().addImageChangeListener(this);
    }

    @Override
    public void crosshairMoved() {
        // pass
    }

    @Override
    public void imageChanged() {
        //
    }

    @Override
    public void imageLoaded() {
        Display.getDefault().syncExec(new Runnable() {
            @Override
            public void run() {
                setEnabled(PixelPerfectModel.getModel().getImage() != null);
            }
        });
    }

    @Override
    public void overlayChanged() {
        // pass
    }

    @Override
    public void overlayTransparencyChanged() {
        // pass
    }

    @Override
    public void selectionChanged() {
        // pass
    }

    @Override
    public void treeChanged() {
        // pass
    }

    @Override
    public void zoomChanged() {
        // pass
    }
}
