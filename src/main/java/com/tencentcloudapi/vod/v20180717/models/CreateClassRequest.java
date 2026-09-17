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

public class CreateClassRequest extends AbstractModel {

    /**
    * 
    */
    @SerializedName("ParentId")
    @Expose
    private Long ParentId;

    /**
    * 
    */
    @SerializedName("ClassName")
    @Expose
    private String ClassName;

    /**
    * 
    */
    @SerializedName("SubAppId")
    @Expose
    private Long SubAppId;

    /**
     * Get  
     * @return ParentId 
     */
    public Long getParentId() {
        return this.ParentId;
    }

    /**
     * Set 
     * @param ParentId 
     */
    public void setParentId(Long ParentId) {
        this.ParentId = ParentId;
    }

    /**
     * Get  
     * @return ClassName 
     */
    public String getClassName() {
        return this.ClassName;
    }

    /**
     * Set 
     * @param ClassName 
     */
    public void setClassName(String ClassName) {
        this.ClassName = ClassName;
    }

    /**
     * Get  
     * @return SubAppId 
     */
    public Long getSubAppId() {
        return this.SubAppId;
    }

    /**
     * Set 
     * @param SubAppId 
     */
    public void setSubAppId(Long SubAppId) {
        this.SubAppId = SubAppId;
    }

    public CreateClassRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateClassRequest(CreateClassRequest source) {
        if (source.ParentId != null) {
            this.ParentId = new Long(source.ParentId);
        }
        if (source.ClassName != null) {
            this.ClassName = new String(source.ClassName);
        }
        if (source.SubAppId != null) {
            this.SubAppId = new Long(source.SubAppId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ParentId", this.ParentId);
        this.setParamSimple(map, prefix + "ClassName", this.ClassName);
        this.setParamSimple(map, prefix + "SubAppId", this.SubAppId);

    }
}

