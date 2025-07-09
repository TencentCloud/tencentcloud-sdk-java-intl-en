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
package com.tencentcloudapi.lcic.v20220817.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeleteAppCustomContentRequest extends AbstractModel {

    /**
    * The application ID.
    */
    @SerializedName("SdkAppId")
    @Expose
    private Long SdkAppId;

    /**
    * The custom elements (for which a scene has been configured) to delete. If this is empty, all custom elements will be deleted.
    */
    @SerializedName("Scenes")
    @Expose
    private String [] Scenes;

    /**
     * Get The application ID. 
     * @return SdkAppId The application ID.
     */
    public Long getSdkAppId() {
        return this.SdkAppId;
    }

    /**
     * Set The application ID.
     * @param SdkAppId The application ID.
     */
    public void setSdkAppId(Long SdkAppId) {
        this.SdkAppId = SdkAppId;
    }

    /**
     * Get The custom elements (for which a scene has been configured) to delete. If this is empty, all custom elements will be deleted. 
     * @return Scenes The custom elements (for which a scene has been configured) to delete. If this is empty, all custom elements will be deleted.
     */
    public String [] getScenes() {
        return this.Scenes;
    }

    /**
     * Set The custom elements (for which a scene has been configured) to delete. If this is empty, all custom elements will be deleted.
     * @param Scenes The custom elements (for which a scene has been configured) to delete. If this is empty, all custom elements will be deleted.
     */
    public void setScenes(String [] Scenes) {
        this.Scenes = Scenes;
    }

    public DeleteAppCustomContentRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteAppCustomContentRequest(DeleteAppCustomContentRequest source) {
        if (source.SdkAppId != null) {
            this.SdkAppId = new Long(source.SdkAppId);
        }
        if (source.Scenes != null) {
            this.Scenes = new String[source.Scenes.length];
            for (int i = 0; i < source.Scenes.length; i++) {
                this.Scenes[i] = new String(source.Scenes[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SdkAppId", this.SdkAppId);
        this.setParamArraySimple(map, prefix + "Scenes.", this.Scenes);

    }
}

