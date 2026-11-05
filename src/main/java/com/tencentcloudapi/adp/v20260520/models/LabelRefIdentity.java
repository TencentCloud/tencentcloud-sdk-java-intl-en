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
package com.tencentcloudapi.adp.v20260520.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class LabelRefIdentity extends AbstractModel {

    /**
    * <p>Tag ID</p>
    */
    @SerializedName("LabelId")
    @Expose
    private String LabelId;

    /**
    * <p>Tag standard term ID list</p>
    */
    @SerializedName("LabelTermIdList")
    @Expose
    private String [] LabelTermIdList;

    /**
     * Get <p>Tag ID</p> 
     * @return LabelId <p>Tag ID</p>
     */
    public String getLabelId() {
        return this.LabelId;
    }

    /**
     * Set <p>Tag ID</p>
     * @param LabelId <p>Tag ID</p>
     */
    public void setLabelId(String LabelId) {
        this.LabelId = LabelId;
    }

    /**
     * Get <p>Tag standard term ID list</p> 
     * @return LabelTermIdList <p>Tag standard term ID list</p>
     */
    public String [] getLabelTermIdList() {
        return this.LabelTermIdList;
    }

    /**
     * Set <p>Tag standard term ID list</p>
     * @param LabelTermIdList <p>Tag standard term ID list</p>
     */
    public void setLabelTermIdList(String [] LabelTermIdList) {
        this.LabelTermIdList = LabelTermIdList;
    }

    public LabelRefIdentity() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public LabelRefIdentity(LabelRefIdentity source) {
        if (source.LabelId != null) {
            this.LabelId = new String(source.LabelId);
        }
        if (source.LabelTermIdList != null) {
            this.LabelTermIdList = new String[source.LabelTermIdList.length];
            for (int i = 0; i < source.LabelTermIdList.length; i++) {
                this.LabelTermIdList[i] = new String(source.LabelTermIdList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "LabelId", this.LabelId);
        this.setParamArraySimple(map, prefix + "LabelTermIdList.", this.LabelTermIdList);

    }
}

