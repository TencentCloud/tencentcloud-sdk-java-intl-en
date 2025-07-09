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
package com.tencentcloudapi.gme.v20180711.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class VoiceFilterConf extends AbstractModel {

    /**
    * Phrase Filtering status. Valid values: `open`, `close`.
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * Scenario configuration information, such as status and callback URL.
Note: This field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("SceneInfos")
    @Expose
    private SceneInfo [] SceneInfos;

    /**
     * Get Phrase Filtering status. Valid values: `open`, `close`. 
     * @return Status Phrase Filtering status. Valid values: `open`, `close`.
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set Phrase Filtering status. Valid values: `open`, `close`.
     * @param Status Phrase Filtering status. Valid values: `open`, `close`.
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get Scenario configuration information, such as status and callback URL.
Note: This field may return `null`, indicating that no valid values can be obtained. 
     * @return SceneInfos Scenario configuration information, such as status and callback URL.
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public SceneInfo [] getSceneInfos() {
        return this.SceneInfos;
    }

    /**
     * Set Scenario configuration information, such as status and callback URL.
Note: This field may return `null`, indicating that no valid values can be obtained.
     * @param SceneInfos Scenario configuration information, such as status and callback URL.
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public void setSceneInfos(SceneInfo [] SceneInfos) {
        this.SceneInfos = SceneInfos;
    }

    public VoiceFilterConf() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public VoiceFilterConf(VoiceFilterConf source) {
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.SceneInfos != null) {
            this.SceneInfos = new SceneInfo[source.SceneInfos.length];
            for (int i = 0; i < source.SceneInfos.length; i++) {
                this.SceneInfos[i] = new SceneInfo(source.SceneInfos[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamArrayObj(map, prefix + "SceneInfos.", this.SceneInfos);

    }
}

