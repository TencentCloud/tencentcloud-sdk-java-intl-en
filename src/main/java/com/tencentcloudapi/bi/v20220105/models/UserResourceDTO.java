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
package com.tencentcloudapi.bi.v20220105.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UserResourceDTO extends AbstractModel {

    /**
    * Enterprise ID.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("CorpId")
    @Expose
    private String CorpId;

    /**
    * User ID
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("UserId")
    @Expose
    private String UserId;

    /**
    * Username.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("UserName")
    @Expose
    private String UserName;

    /**
    * Resource list
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ResourceList")
    @Expose
    private ResourceItem [] ResourceList;

    /**
     * Get Enterprise ID.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return CorpId Enterprise ID.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getCorpId() {
        return this.CorpId;
    }

    /**
     * Set Enterprise ID.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param CorpId Enterprise ID.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setCorpId(String CorpId) {
        this.CorpId = CorpId;
    }

    /**
     * Get User ID
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return UserId User ID
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getUserId() {
        return this.UserId;
    }

    /**
     * Set User ID
Note: This field may return null, indicating that no valid values can be obtained.
     * @param UserId User ID
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setUserId(String UserId) {
        this.UserId = UserId;
    }

    /**
     * Get Username.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return UserName Username.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getUserName() {
        return this.UserName;
    }

    /**
     * Set Username.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param UserName Username.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    /**
     * Get Resource list
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ResourceList Resource list
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public ResourceItem [] getResourceList() {
        return this.ResourceList;
    }

    /**
     * Set Resource list
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ResourceList Resource list
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setResourceList(ResourceItem [] ResourceList) {
        this.ResourceList = ResourceList;
    }

    public UserResourceDTO() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UserResourceDTO(UserResourceDTO source) {
        if (source.CorpId != null) {
            this.CorpId = new String(source.CorpId);
        }
        if (source.UserId != null) {
            this.UserId = new String(source.UserId);
        }
        if (source.UserName != null) {
            this.UserName = new String(source.UserName);
        }
        if (source.ResourceList != null) {
            this.ResourceList = new ResourceItem[source.ResourceList.length];
            for (int i = 0; i < source.ResourceList.length; i++) {
                this.ResourceList[i] = new ResourceItem(source.ResourceList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CorpId", this.CorpId);
        this.setParamSimple(map, prefix + "UserId", this.UserId);
        this.setParamSimple(map, prefix + "UserName", this.UserName);
        this.setParamArrayObj(map, prefix + "ResourceList.", this.ResourceList);

    }
}

