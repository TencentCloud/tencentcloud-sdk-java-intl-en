/*
 * Copyright (c) 2017-2025 Tencent. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.tencentcloudapi.mps.v20190612.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AsrHotWordsConfigure extends AbstractModel {

    /**
    * Hotword switch.
    */
    @SerializedName("Switch")
    @Expose
    private String Switch;

    /**
    * Hotword lexicon ID
    */
    @SerializedName("LibraryId")
    @Expose
    private String LibraryId;

    /**
     * Get Hotword switch. 
     * @return Switch Hotword switch.
     */
    public String getSwitch() {
        return this.Switch;
    }

    /**
     * Set Hotword switch.
     * @param Switch Hotword switch.
     */
    public void setSwitch(String Switch) {
        this.Switch = Switch;
    }

    /**
     * Get Hotword lexicon ID 
     * @return LibraryId Hotword lexicon ID
     */
    public String getLibraryId() {
        return this.LibraryId;
    }

    /**
     * Set Hotword lexicon ID
     * @param LibraryId Hotword lexicon ID
     */
    public void setLibraryId(String LibraryId) {
        this.LibraryId = LibraryId;
    }

    public AsrHotWordsConfigure() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AsrHotWordsConfigure(AsrHotWordsConfigure source) {
        if (source.Switch != null) {
            this.Switch = new String(source.Switch);
        }
        if (source.LibraryId != null) {
            this.LibraryId = new String(source.LibraryId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Switch", this.Switch);
        this.setParamSimple(map, prefix + "LibraryId", this.LibraryId);

    }
}

