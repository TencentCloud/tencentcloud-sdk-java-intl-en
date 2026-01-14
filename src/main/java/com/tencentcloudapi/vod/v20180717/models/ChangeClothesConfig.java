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
package com.tencentcloudapi.vod.v20180717.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ChangeClothesConfig extends AbstractModel {

    /**
    * Manually input the image list of **clothing** that needs to be replaced. currently support a maximum of 4 images.
    */
    @SerializedName("ClothesFileInfos")
    @Expose
    private SceneAigcImageTaskInputFileInfo [] ClothesFileInfos;

    /**
     * Get Manually input the image list of **clothing** that needs to be replaced. currently support a maximum of 4 images. 
     * @return ClothesFileInfos Manually input the image list of **clothing** that needs to be replaced. currently support a maximum of 4 images.
     */
    public SceneAigcImageTaskInputFileInfo [] getClothesFileInfos() {
        return this.ClothesFileInfos;
    }

    /**
     * Set Manually input the image list of **clothing** that needs to be replaced. currently support a maximum of 4 images.
     * @param ClothesFileInfos Manually input the image list of **clothing** that needs to be replaced. currently support a maximum of 4 images.
     */
    public void setClothesFileInfos(SceneAigcImageTaskInputFileInfo [] ClothesFileInfos) {
        this.ClothesFileInfos = ClothesFileInfos;
    }

    public ChangeClothesConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ChangeClothesConfig(ChangeClothesConfig source) {
        if (source.ClothesFileInfos != null) {
            this.ClothesFileInfos = new SceneAigcImageTaskInputFileInfo[source.ClothesFileInfos.length];
            for (int i = 0; i < source.ClothesFileInfos.length; i++) {
                this.ClothesFileInfos[i] = new SceneAigcImageTaskInputFileInfo(source.ClothesFileInfos[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "ClothesFileInfos.", this.ClothesFileInfos);

    }
}

