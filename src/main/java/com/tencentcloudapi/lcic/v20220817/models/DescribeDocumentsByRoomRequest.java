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
package com.tencentcloudapi.lcic.v20220817.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeDocumentsByRoomRequest extends AbstractModel {

    /**
    * The room ID.
    */
    @SerializedName("RoomId")
    @Expose
    private Long RoomId;

    /**
    * The SDKAppID assigned by LCIC.
    */
    @SerializedName("SdkAppId")
    @Expose
    private Long SdkAppId;

    /**
    * The page to return records from. Pagination starts from 1, which is also the default value of this parameter.
    */
    @SerializedName("Page")
    @Expose
    private Long Page;

    /**
    * The maximum number of records to return per page. The maximum value can be 1000. The default value is 100.
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * The document access type. [0]: The private documents of the owner. [1]: The public documents of the owner. [0,1]: The private and public documents of the owner. [2]: The private and public documents of all users (including the owner). Default value: [2].
    */
    @SerializedName("Permission")
    @Expose
    private Long [] Permission;

    /**
    * The user ID of the document owner. If you do not specify this, the information of all documents under the application will be returned.
    */
    @SerializedName("Owner")
    @Expose
    private String Owner;

    /**
     * Get The room ID. 
     * @return RoomId The room ID.
     */
    public Long getRoomId() {
        return this.RoomId;
    }

    /**
     * Set The room ID.
     * @param RoomId The room ID.
     */
    public void setRoomId(Long RoomId) {
        this.RoomId = RoomId;
    }

    /**
     * Get The SDKAppID assigned by LCIC. 
     * @return SdkAppId The SDKAppID assigned by LCIC.
     */
    public Long getSdkAppId() {
        return this.SdkAppId;
    }

    /**
     * Set The SDKAppID assigned by LCIC.
     * @param SdkAppId The SDKAppID assigned by LCIC.
     */
    public void setSdkAppId(Long SdkAppId) {
        this.SdkAppId = SdkAppId;
    }

    /**
     * Get The page to return records from. Pagination starts from 1, which is also the default value of this parameter. 
     * @return Page The page to return records from. Pagination starts from 1, which is also the default value of this parameter.
     */
    public Long getPage() {
        return this.Page;
    }

    /**
     * Set The page to return records from. Pagination starts from 1, which is also the default value of this parameter.
     * @param Page The page to return records from. Pagination starts from 1, which is also the default value of this parameter.
     */
    public void setPage(Long Page) {
        this.Page = Page;
    }

    /**
     * Get The maximum number of records to return per page. The maximum value can be 1000. The default value is 100. 
     * @return Limit The maximum number of records to return per page. The maximum value can be 1000. The default value is 100.
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set The maximum number of records to return per page. The maximum value can be 1000. The default value is 100.
     * @param Limit The maximum number of records to return per page. The maximum value can be 1000. The default value is 100.
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get The document access type. [0]: The private documents of the owner. [1]: The public documents of the owner. [0,1]: The private and public documents of the owner. [2]: The private and public documents of all users (including the owner). Default value: [2]. 
     * @return Permission The document access type. [0]: The private documents of the owner. [1]: The public documents of the owner. [0,1]: The private and public documents of the owner. [2]: The private and public documents of all users (including the owner). Default value: [2].
     */
    public Long [] getPermission() {
        return this.Permission;
    }

    /**
     * Set The document access type. [0]: The private documents of the owner. [1]: The public documents of the owner. [0,1]: The private and public documents of the owner. [2]: The private and public documents of all users (including the owner). Default value: [2].
     * @param Permission The document access type. [0]: The private documents of the owner. [1]: The public documents of the owner. [0,1]: The private and public documents of the owner. [2]: The private and public documents of all users (including the owner). Default value: [2].
     */
    public void setPermission(Long [] Permission) {
        this.Permission = Permission;
    }

    /**
     * Get The user ID of the document owner. If you do not specify this, the information of all documents under the application will be returned. 
     * @return Owner The user ID of the document owner. If you do not specify this, the information of all documents under the application will be returned.
     */
    public String getOwner() {
        return this.Owner;
    }

    /**
     * Set The user ID of the document owner. If you do not specify this, the information of all documents under the application will be returned.
     * @param Owner The user ID of the document owner. If you do not specify this, the information of all documents under the application will be returned.
     */
    public void setOwner(String Owner) {
        this.Owner = Owner;
    }

    public DescribeDocumentsByRoomRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeDocumentsByRoomRequest(DescribeDocumentsByRoomRequest source) {
        if (source.RoomId != null) {
            this.RoomId = new Long(source.RoomId);
        }
        if (source.SdkAppId != null) {
            this.SdkAppId = new Long(source.SdkAppId);
        }
        if (source.Page != null) {
            this.Page = new Long(source.Page);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Permission != null) {
            this.Permission = new Long[source.Permission.length];
            for (int i = 0; i < source.Permission.length; i++) {
                this.Permission[i] = new Long(source.Permission[i]);
            }
        }
        if (source.Owner != null) {
            this.Owner = new String(source.Owner);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RoomId", this.RoomId);
        this.setParamSimple(map, prefix + "SdkAppId", this.SdkAppId);
        this.setParamSimple(map, prefix + "Page", this.Page);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamArraySimple(map, prefix + "Permission.", this.Permission);
        this.setParamSimple(map, prefix + "Owner", this.Owner);

    }
}

