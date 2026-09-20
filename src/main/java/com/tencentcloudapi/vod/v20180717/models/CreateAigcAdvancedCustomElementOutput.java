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

public class CreateAigcAdvancedCustomElementOutput extends AbstractModel {

    /**
    * <p>Custom subject list.</p>
    */
    @SerializedName("InfoList")
    @Expose
    private AdvancedElementInfo [] InfoList;

    /**
     * Get <p>Custom subject list.</p> 
     * @return InfoList <p>Custom subject list.</p>
     */
    public AdvancedElementInfo [] getInfoList() {
        return this.InfoList;
    }

    /**
     * Set <p>Custom subject list.</p>
     * @param InfoList <p>Custom subject list.</p>
     */
    public void setInfoList(AdvancedElementInfo [] InfoList) {
        this.InfoList = InfoList;
    }

    public CreateAigcAdvancedCustomElementOutput() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateAigcAdvancedCustomElementOutput(CreateAigcAdvancedCustomElementOutput source) {
        if (source.InfoList != null) {
            this.InfoList = new AdvancedElementInfo[source.InfoList.length];
            for (int i = 0; i < source.InfoList.length; i++) {
                this.InfoList[i] = new AdvancedElementInfo(source.InfoList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "InfoList.", this.InfoList);

    }
}

