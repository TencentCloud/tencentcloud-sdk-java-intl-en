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
package com.tencentcloudapi.cam.v20190116.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class GetGroupResponse extends AbstractModel {

    /**
    * User Group ID
    */
    @SerializedName("GroupId")
    @Expose
    private Long GroupId;

    /**
    * User Group name
    */
    @SerializedName("GroupName")
    @Expose
    private String GroupName;

    /**
    * Number of members in the User Group
    */
    @SerializedName("GroupNum")
    @Expose
    private Long GroupNum;

    /**
    * User Group description
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * Time User Group created
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * User Group member information
    */
    @SerializedName("UserInfo")
    @Expose
    private GroupMemberInfo [] UserInfo;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get User Group ID 
     * @return GroupId User Group ID
     */
    public Long getGroupId() {
        return this.GroupId;
    }

    /**
     * Set User Group ID
     * @param GroupId User Group ID
     */
    public void setGroupId(Long GroupId) {
        this.GroupId = GroupId;
    }

    /**
     * Get User Group name 
     * @return GroupName User Group name
     */
    public String getGroupName() {
        return this.GroupName;
    }

    /**
     * Set User Group name
     * @param GroupName User Group name
     */
    public void setGroupName(String GroupName) {
        this.GroupName = GroupName;
    }

    /**
     * Get Number of members in the User Group 
     * @return GroupNum Number of members in the User Group
     */
    public Long getGroupNum() {
        return this.GroupNum;
    }

    /**
     * Set Number of members in the User Group
     * @param GroupNum Number of members in the User Group
     */
    public void setGroupNum(Long GroupNum) {
        this.GroupNum = GroupNum;
    }

    /**
     * Get User Group description 
     * @return Remark User Group description
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set User Group description
     * @param Remark User Group description
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    /**
     * Get Time User Group created 
     * @return CreateTime Time User Group created
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set Time User Group created
     * @param CreateTime Time User Group created
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get User Group member information 
     * @return UserInfo User Group member information
     */
    public GroupMemberInfo [] getUserInfo() {
        return this.UserInfo;
    }

    /**
     * Set User Group member information
     * @param UserInfo User Group member information
     */
    public void setUserInfo(GroupMemberInfo [] UserInfo) {
        this.UserInfo = UserInfo;
    }

    /**
     * Get The unique request ID, which is returned for each request. RequestId is required for locating a problem. 
     * @return RequestId The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     * @param RequestId The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public GetGroupResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GetGroupResponse(GetGroupResponse source) {
        if (source.GroupId != null) {
            this.GroupId = new Long(source.GroupId);
        }
        if (source.GroupName != null) {
            this.GroupName = new String(source.GroupName);
        }
        if (source.GroupNum != null) {
            this.GroupNum = new Long(source.GroupNum);
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.UserInfo != null) {
            this.UserInfo = new GroupMemberInfo[source.UserInfo.length];
            for (int i = 0; i < source.UserInfo.length; i++) {
                this.UserInfo[i] = new GroupMemberInfo(source.UserInfo[i]);
            }
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "GroupId", this.GroupId);
        this.setParamSimple(map, prefix + "GroupName", this.GroupName);
        this.setParamSimple(map, prefix + "GroupNum", this.GroupNum);
        this.setParamSimple(map, prefix + "Remark", this.Remark);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamArrayObj(map, prefix + "UserInfo.", this.UserInfo);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

