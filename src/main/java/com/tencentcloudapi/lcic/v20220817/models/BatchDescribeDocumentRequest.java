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
package com.tencentcloudapi.lcic.v20220817.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class BatchDescribeDocumentRequest extends AbstractModel {

    /**
    * The SDKAppID assigned by LCIC.
    */
    @SerializedName("SdkAppId")
    @Expose
    private Long SdkAppId;

    /**
    * The page to return records from. Pagination starts from 1.
    */
    @SerializedName("Page")
    @Expose
    private Long Page;

    /**
    * The maximum number of records per page. The value of this parameter cannot exceed `1000`.
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * The courseware access. [0]: The private courseware of the specified user (`Owner`) will be returned; [1]: The public courseware of the specified user will be returned; [0,1]: Both the private and public courseware of the specified user will be returned; [2]: The private courseware of the specified user and the public courseware of all users (including `Owner`) will be returned.
    */
    @SerializedName("Permission")
    @Expose
    private Long [] Permission;

    /**
    * The user ID of the courseware owner. If you do not specify this, the information of all courseware under the application will be returned.
    */
    @SerializedName("Owner")
    @Expose
    private String Owner;

    /**
    * The filename keyword.
    */
    @SerializedName("Keyword")
    @Expose
    private String Keyword;

    /**
    * The courseware IDs. Non-existent IDs will be ignored.
    */
    @SerializedName("DocumentId")
    @Expose
    private String [] DocumentId;

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
     * Get The page to return records from. Pagination starts from 1. 
     * @return Page The page to return records from. Pagination starts from 1.
     */
    public Long getPage() {
        return this.Page;
    }

    /**
     * Set The page to return records from. Pagination starts from 1.
     * @param Page The page to return records from. Pagination starts from 1.
     */
    public void setPage(Long Page) {
        this.Page = Page;
    }

    /**
     * Get The maximum number of records per page. The value of this parameter cannot exceed `1000`. 
     * @return Limit The maximum number of records per page. The value of this parameter cannot exceed `1000`.
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set The maximum number of records per page. The value of this parameter cannot exceed `1000`.
     * @param Limit The maximum number of records per page. The value of this parameter cannot exceed `1000`.
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get The courseware access. [0]: The private courseware of the specified user (`Owner`) will be returned; [1]: The public courseware of the specified user will be returned; [0,1]: Both the private and public courseware of the specified user will be returned; [2]: The private courseware of the specified user and the public courseware of all users (including `Owner`) will be returned. 
     * @return Permission The courseware access. [0]: The private courseware of the specified user (`Owner`) will be returned; [1]: The public courseware of the specified user will be returned; [0,1]: Both the private and public courseware of the specified user will be returned; [2]: The private courseware of the specified user and the public courseware of all users (including `Owner`) will be returned.
     */
    public Long [] getPermission() {
        return this.Permission;
    }

    /**
     * Set The courseware access. [0]: The private courseware of the specified user (`Owner`) will be returned; [1]: The public courseware of the specified user will be returned; [0,1]: Both the private and public courseware of the specified user will be returned; [2]: The private courseware of the specified user and the public courseware of all users (including `Owner`) will be returned.
     * @param Permission The courseware access. [0]: The private courseware of the specified user (`Owner`) will be returned; [1]: The public courseware of the specified user will be returned; [0,1]: Both the private and public courseware of the specified user will be returned; [2]: The private courseware of the specified user and the public courseware of all users (including `Owner`) will be returned.
     */
    public void setPermission(Long [] Permission) {
        this.Permission = Permission;
    }

    /**
     * Get The user ID of the courseware owner. If you do not specify this, the information of all courseware under the application will be returned. 
     * @return Owner The user ID of the courseware owner. If you do not specify this, the information of all courseware under the application will be returned.
     */
    public String getOwner() {
        return this.Owner;
    }

    /**
     * Set The user ID of the courseware owner. If you do not specify this, the information of all courseware under the application will be returned.
     * @param Owner The user ID of the courseware owner. If you do not specify this, the information of all courseware under the application will be returned.
     */
    public void setOwner(String Owner) {
        this.Owner = Owner;
    }

    /**
     * Get The filename keyword. 
     * @return Keyword The filename keyword.
     */
    public String getKeyword() {
        return this.Keyword;
    }

    /**
     * Set The filename keyword.
     * @param Keyword The filename keyword.
     */
    public void setKeyword(String Keyword) {
        this.Keyword = Keyword;
    }

    /**
     * Get The courseware IDs. Non-existent IDs will be ignored. 
     * @return DocumentId The courseware IDs. Non-existent IDs will be ignored.
     */
    public String [] getDocumentId() {
        return this.DocumentId;
    }

    /**
     * Set The courseware IDs. Non-existent IDs will be ignored.
     * @param DocumentId The courseware IDs. Non-existent IDs will be ignored.
     */
    public void setDocumentId(String [] DocumentId) {
        this.DocumentId = DocumentId;
    }

    public BatchDescribeDocumentRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BatchDescribeDocumentRequest(BatchDescribeDocumentRequest source) {
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
        if (source.Keyword != null) {
            this.Keyword = new String(source.Keyword);
        }
        if (source.DocumentId != null) {
            this.DocumentId = new String[source.DocumentId.length];
            for (int i = 0; i < source.DocumentId.length; i++) {
                this.DocumentId[i] = new String(source.DocumentId[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SdkAppId", this.SdkAppId);
        this.setParamSimple(map, prefix + "Page", this.Page);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamArraySimple(map, prefix + "Permission.", this.Permission);
        this.setParamSimple(map, prefix + "Owner", this.Owner);
        this.setParamSimple(map, prefix + "Keyword", this.Keyword);
        this.setParamArraySimple(map, prefix + "DocumentId.", this.DocumentId);

    }
}

