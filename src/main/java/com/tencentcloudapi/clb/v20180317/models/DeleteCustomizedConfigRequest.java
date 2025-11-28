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
package com.tencentcloudapi.clb.v20180317.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeleteCustomizedConfigRequest extends AbstractModel {

    /**
    * Specifies the configuration ID list for deletion.
    */
    @SerializedName("UconfigIdList")
    @Expose
    private String [] UconfigIdList;

    /**
     * Get Specifies the configuration ID list for deletion. 
     * @return UconfigIdList Specifies the configuration ID list for deletion.
     */
    public String [] getUconfigIdList() {
        return this.UconfigIdList;
    }

    /**
     * Set Specifies the configuration ID list for deletion.
     * @param UconfigIdList Specifies the configuration ID list for deletion.
     */
    public void setUconfigIdList(String [] UconfigIdList) {
        this.UconfigIdList = UconfigIdList;
    }

    public DeleteCustomizedConfigRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteCustomizedConfigRequest(DeleteCustomizedConfigRequest source) {
        if (source.UconfigIdList != null) {
            this.UconfigIdList = new String[source.UconfigIdList.length];
            for (int i = 0; i < source.UconfigIdList.length; i++) {
                this.UconfigIdList[i] = new String(source.UconfigIdList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "UconfigIdList.", this.UconfigIdList);

    }
}

