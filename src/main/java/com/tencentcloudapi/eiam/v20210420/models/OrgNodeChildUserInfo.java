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
package com.tencentcloudapi.eiam.v20210420.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class OrgNodeChildUserInfo extends AbstractModel {

    /**
    * Organization node ID, which is globally unique and can contain up to 64 characters.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("OrgNodeId")
    @Expose
    private String OrgNodeId;

    /**
    * User information list.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("UserInfo")
    @Expose
    private UserInfo [] UserInfo;

    /**
    * Total number of users under the current organization node.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TotalUserNum")
    @Expose
    private Long TotalUserNum;

    /**
    * Organization ID path.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("OrgNodeIdPath")
    @Expose
    private String OrgNodeIdPath;

    /**
    * Organization name path.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("OrgNodeNamePath")
    @Expose
    private String OrgNodeNamePath;

    /**
     * Get Organization node ID, which is globally unique and can contain up to 64 characters.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return OrgNodeId Organization node ID, which is globally unique and can contain up to 64 characters.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getOrgNodeId() {
        return this.OrgNodeId;
    }

    /**
     * Set Organization node ID, which is globally unique and can contain up to 64 characters.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param OrgNodeId Organization node ID, which is globally unique and can contain up to 64 characters.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setOrgNodeId(String OrgNodeId) {
        this.OrgNodeId = OrgNodeId;
    }

    /**
     * Get User information list.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return UserInfo User information list.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public UserInfo [] getUserInfo() {
        return this.UserInfo;
    }

    /**
     * Set User information list.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param UserInfo User information list.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setUserInfo(UserInfo [] UserInfo) {
        this.UserInfo = UserInfo;
    }

    /**
     * Get Total number of users under the current organization node.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return TotalUserNum Total number of users under the current organization node.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Long getTotalUserNum() {
        return this.TotalUserNum;
    }

    /**
     * Set Total number of users under the current organization node.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param TotalUserNum Total number of users under the current organization node.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setTotalUserNum(Long TotalUserNum) {
        this.TotalUserNum = TotalUserNum;
    }

    /**
     * Get Organization ID path.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return OrgNodeIdPath Organization ID path.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getOrgNodeIdPath() {
        return this.OrgNodeIdPath;
    }

    /**
     * Set Organization ID path.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param OrgNodeIdPath Organization ID path.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setOrgNodeIdPath(String OrgNodeIdPath) {
        this.OrgNodeIdPath = OrgNodeIdPath;
    }

    /**
     * Get Organization name path.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return OrgNodeNamePath Organization name path.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getOrgNodeNamePath() {
        return this.OrgNodeNamePath;
    }

    /**
     * Set Organization name path.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param OrgNodeNamePath Organization name path.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setOrgNodeNamePath(String OrgNodeNamePath) {
        this.OrgNodeNamePath = OrgNodeNamePath;
    }

    public OrgNodeChildUserInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public OrgNodeChildUserInfo(OrgNodeChildUserInfo source) {
        if (source.OrgNodeId != null) {
            this.OrgNodeId = new String(source.OrgNodeId);
        }
        if (source.UserInfo != null) {
            this.UserInfo = new UserInfo[source.UserInfo.length];
            for (int i = 0; i < source.UserInfo.length; i++) {
                this.UserInfo[i] = new UserInfo(source.UserInfo[i]);
            }
        }
        if (source.TotalUserNum != null) {
            this.TotalUserNum = new Long(source.TotalUserNum);
        }
        if (source.OrgNodeIdPath != null) {
            this.OrgNodeIdPath = new String(source.OrgNodeIdPath);
        }
        if (source.OrgNodeNamePath != null) {
            this.OrgNodeNamePath = new String(source.OrgNodeNamePath);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "OrgNodeId", this.OrgNodeId);
        this.setParamArrayObj(map, prefix + "UserInfo.", this.UserInfo);
        this.setParamSimple(map, prefix + "TotalUserNum", this.TotalUserNum);
        this.setParamSimple(map, prefix + "OrgNodeIdPath", this.OrgNodeIdPath);
        this.setParamSimple(map, prefix + "OrgNodeNamePath", this.OrgNodeNamePath);

    }
}

