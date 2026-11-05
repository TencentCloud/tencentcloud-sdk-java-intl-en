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

public class CreateMsgRecordCategoryRequest extends AbstractModel {

    /**
    * <p>Category name</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>App ID</p>
    */
    @SerializedName("AppId")
    @Expose
    private String AppId;

    /**
    * <p>Parent category business ID. 0 represents a first-level category (unclassified)</p>
    */
    @SerializedName("ParentId")
    @Expose
    private String ParentId;

    /**
     * Get <p>Category name</p> 
     * @return Name <p>Category name</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>Category name</p>
     * @param Name <p>Category name</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>App ID</p> 
     * @return AppId <p>App ID</p>
     */
    public String getAppId() {
        return this.AppId;
    }

    /**
     * Set <p>App ID</p>
     * @param AppId <p>App ID</p>
     */
    public void setAppId(String AppId) {
        this.AppId = AppId;
    }

    /**
     * Get <p>Parent category business ID. 0 represents a first-level category (unclassified)</p> 
     * @return ParentId <p>Parent category business ID. 0 represents a first-level category (unclassified)</p>
     */
    public String getParentId() {
        return this.ParentId;
    }

    /**
     * Set <p>Parent category business ID. 0 represents a first-level category (unclassified)</p>
     * @param ParentId <p>Parent category business ID. 0 represents a first-level category (unclassified)</p>
     */
    public void setParentId(String ParentId) {
        this.ParentId = ParentId;
    }

    public CreateMsgRecordCategoryRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateMsgRecordCategoryRequest(CreateMsgRecordCategoryRequest source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.AppId != null) {
            this.AppId = new String(source.AppId);
        }
        if (source.ParentId != null) {
            this.ParentId = new String(source.ParentId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "AppId", this.AppId);
        this.setParamSimple(map, prefix + "ParentId", this.ParentId);

    }
}

