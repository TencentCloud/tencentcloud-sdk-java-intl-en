/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
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
package com.tencentcloudapi.ciam.v20210420.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ListUserGroupsRequest extends AbstractModel {

    /**
    * User directory ID
    */
    @SerializedName("UserStoreId")
    @Expose
    private String UserStoreId;

    /**
    * Number of queried pages
    */
    @SerializedName("Page")
    @Expose
    private Long Page;

    /**
    * Number of entries per page
    */
    @SerializedName("Size")
    @Expose
    private Long Size;

    /**
    * Query conditions (user group ID or user group name)
    */
    @SerializedName("Condition")
    @Expose
    private String Condition;

    /**
     * Get User directory ID 
     * @return UserStoreId User directory ID
     */
    public String getUserStoreId() {
        return this.UserStoreId;
    }

    /**
     * Set User directory ID
     * @param UserStoreId User directory ID
     */
    public void setUserStoreId(String UserStoreId) {
        this.UserStoreId = UserStoreId;
    }

    /**
     * Get Number of queried pages 
     * @return Page Number of queried pages
     */
    public Long getPage() {
        return this.Page;
    }

    /**
     * Set Number of queried pages
     * @param Page Number of queried pages
     */
    public void setPage(Long Page) {
        this.Page = Page;
    }

    /**
     * Get Number of entries per page 
     * @return Size Number of entries per page
     */
    public Long getSize() {
        return this.Size;
    }

    /**
     * Set Number of entries per page
     * @param Size Number of entries per page
     */
    public void setSize(Long Size) {
        this.Size = Size;
    }

    /**
     * Get Query conditions (user group ID or user group name) 
     * @return Condition Query conditions (user group ID or user group name)
     */
    public String getCondition() {
        return this.Condition;
    }

    /**
     * Set Query conditions (user group ID or user group name)
     * @param Condition Query conditions (user group ID or user group name)
     */
    public void setCondition(String Condition) {
        this.Condition = Condition;
    }

    public ListUserGroupsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ListUserGroupsRequest(ListUserGroupsRequest source) {
        if (source.UserStoreId != null) {
            this.UserStoreId = new String(source.UserStoreId);
        }
        if (source.Page != null) {
            this.Page = new Long(source.Page);
        }
        if (source.Size != null) {
            this.Size = new Long(source.Size);
        }
        if (source.Condition != null) {
            this.Condition = new String(source.Condition);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "UserStoreId", this.UserStoreId);
        this.setParamSimple(map, prefix + "Page", this.Page);
        this.setParamSimple(map, prefix + "Size", this.Size);
        this.setParamSimple(map, prefix + "Condition", this.Condition);

    }
}

