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

public class KBSummary extends AbstractModel {

    /**
    * <p>List of associated applications. Returned only for shared knowledge base.</p>
    */
    @SerializedName("AppList")
    @Expose
    private Identity [] AppList;

    /**
    * <p>Creation time (Unix seconds).</p>
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * <p>Creator</p>
    */
    @SerializedName("Creator")
    @Expose
    private Operator Creator;

    /**
    * <p>Description.</p>
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * <p>Number of documents</p>
    */
    @SerializedName("DocCount")
    @Expose
    private Long DocCount;

    /**
    * <p>Whether it is excessive</p>
    */
    @SerializedName("IsExceeded")
    @Expose
    private Boolean IsExceeded;

    /**
    * <p>Knowledge base ID</p>
    */
    @SerializedName("KbId")
    @Expose
    private String KbId;

    /**
    * <p>Type: 1=default knowledge base, 2=shared knowledge base<table><tbody><tr><td>Enumeration item</td><td>Enumeration value</td><td>Description</td></tr><tr><td>KB_TYPE_UNKNOWN</td><td>0</td><td></td></tr><tr><td>KB_TYPE_DEFAULT</td><td>1</td><td>Default knowledge base</td></tr><tr><td>KB_TYPE_SHARED</td><td>2</td><td>Shared knowledge base</td></tr></tbody></table></p>
    */
    @SerializedName("KbType")
    @Expose
    private Long KbType;

    /**
    * <p>Last operator. Returned only for shared knowledge bases.</p>
    */
    @SerializedName("LatestOperator")
    @Expose
    private Operator LatestOperator;

    /**
    * <p>Knowledge base name.</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>Operation permission.</p>
    */
    @SerializedName("Permission")
    @Expose
    private KBPermission Permission;

    /**
    * <p>List of in-processing statuses</p>
    */
    @SerializedName("ProcessingFlagList")
    @Expose
    private Long [] ProcessingFlagList;

    /**
    * <p>Share sub-type: 1=ordinary, 2=wechat official account<table><tbody><tr><td>Enumeration item</td><td>Enumeration value</td><td>Description</td></tr><tr><td>SHARED_KB_SUB_TYPE_UNKNOWN</td><td>0</td><td></td></tr><tr><td>SHARED_KB_SUB_TYPE_NORMAL</td><td>1</td><td>Ordinary</td></tr><tr><td>SHARED_KB_SUB_TYPE_PUBLIC_ACCOUNT</td><td>2</td><td>WeChat official account</td></tr></tbody></table></p>
    */
    @SerializedName("SharedSubType")
    @Expose
    private Long SharedSubType;

    /**
    * <p>Update time (Unix seconds)</p>
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * <p>Knowledge base space share information</p>
    */
    @SerializedName("SpaceShare")
    @Expose
    private KBSpaceShare SpaceShare;

    /**
     * Get <p>List of associated applications. Returned only for shared knowledge base.</p> 
     * @return AppList <p>List of associated applications. Returned only for shared knowledge base.</p>
     */
    public Identity [] getAppList() {
        return this.AppList;
    }

    /**
     * Set <p>List of associated applications. Returned only for shared knowledge base.</p>
     * @param AppList <p>List of associated applications. Returned only for shared knowledge base.</p>
     */
    public void setAppList(Identity [] AppList) {
        this.AppList = AppList;
    }

    /**
     * Get <p>Creation time (Unix seconds).</p> 
     * @return CreateTime <p>Creation time (Unix seconds).</p>
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set <p>Creation time (Unix seconds).</p>
     * @param CreateTime <p>Creation time (Unix seconds).</p>
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get <p>Creator</p> 
     * @return Creator <p>Creator</p>
     */
    public Operator getCreator() {
        return this.Creator;
    }

    /**
     * Set <p>Creator</p>
     * @param Creator <p>Creator</p>
     */
    public void setCreator(Operator Creator) {
        this.Creator = Creator;
    }

    /**
     * Get <p>Description.</p> 
     * @return Description <p>Description.</p>
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set <p>Description.</p>
     * @param Description <p>Description.</p>
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get <p>Number of documents</p> 
     * @return DocCount <p>Number of documents</p>
     */
    public Long getDocCount() {
        return this.DocCount;
    }

    /**
     * Set <p>Number of documents</p>
     * @param DocCount <p>Number of documents</p>
     */
    public void setDocCount(Long DocCount) {
        this.DocCount = DocCount;
    }

    /**
     * Get <p>Whether it is excessive</p> 
     * @return IsExceeded <p>Whether it is excessive</p>
     */
    public Boolean getIsExceeded() {
        return this.IsExceeded;
    }

    /**
     * Set <p>Whether it is excessive</p>
     * @param IsExceeded <p>Whether it is excessive</p>
     */
    public void setIsExceeded(Boolean IsExceeded) {
        this.IsExceeded = IsExceeded;
    }

    /**
     * Get <p>Knowledge base ID</p> 
     * @return KbId <p>Knowledge base ID</p>
     */
    public String getKbId() {
        return this.KbId;
    }

    /**
     * Set <p>Knowledge base ID</p>
     * @param KbId <p>Knowledge base ID</p>
     */
    public void setKbId(String KbId) {
        this.KbId = KbId;
    }

    /**
     * Get <p>Type: 1=default knowledge base, 2=shared knowledge base<table><tbody><tr><td>Enumeration item</td><td>Enumeration value</td><td>Description</td></tr><tr><td>KB_TYPE_UNKNOWN</td><td>0</td><td></td></tr><tr><td>KB_TYPE_DEFAULT</td><td>1</td><td>Default knowledge base</td></tr><tr><td>KB_TYPE_SHARED</td><td>2</td><td>Shared knowledge base</td></tr></tbody></table></p> 
     * @return KbType <p>Type: 1=default knowledge base, 2=shared knowledge base<table><tbody><tr><td>Enumeration item</td><td>Enumeration value</td><td>Description</td></tr><tr><td>KB_TYPE_UNKNOWN</td><td>0</td><td></td></tr><tr><td>KB_TYPE_DEFAULT</td><td>1</td><td>Default knowledge base</td></tr><tr><td>KB_TYPE_SHARED</td><td>2</td><td>Shared knowledge base</td></tr></tbody></table></p>
     */
    public Long getKbType() {
        return this.KbType;
    }

    /**
     * Set <p>Type: 1=default knowledge base, 2=shared knowledge base<table><tbody><tr><td>Enumeration item</td><td>Enumeration value</td><td>Description</td></tr><tr><td>KB_TYPE_UNKNOWN</td><td>0</td><td></td></tr><tr><td>KB_TYPE_DEFAULT</td><td>1</td><td>Default knowledge base</td></tr><tr><td>KB_TYPE_SHARED</td><td>2</td><td>Shared knowledge base</td></tr></tbody></table></p>
     * @param KbType <p>Type: 1=default knowledge base, 2=shared knowledge base<table><tbody><tr><td>Enumeration item</td><td>Enumeration value</td><td>Description</td></tr><tr><td>KB_TYPE_UNKNOWN</td><td>0</td><td></td></tr><tr><td>KB_TYPE_DEFAULT</td><td>1</td><td>Default knowledge base</td></tr><tr><td>KB_TYPE_SHARED</td><td>2</td><td>Shared knowledge base</td></tr></tbody></table></p>
     */
    public void setKbType(Long KbType) {
        this.KbType = KbType;
    }

    /**
     * Get <p>Last operator. Returned only for shared knowledge bases.</p> 
     * @return LatestOperator <p>Last operator. Returned only for shared knowledge bases.</p>
     */
    public Operator getLatestOperator() {
        return this.LatestOperator;
    }

    /**
     * Set <p>Last operator. Returned only for shared knowledge bases.</p>
     * @param LatestOperator <p>Last operator. Returned only for shared knowledge bases.</p>
     */
    public void setLatestOperator(Operator LatestOperator) {
        this.LatestOperator = LatestOperator;
    }

    /**
     * Get <p>Knowledge base name.</p> 
     * @return Name <p>Knowledge base name.</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>Knowledge base name.</p>
     * @param Name <p>Knowledge base name.</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>Operation permission.</p> 
     * @return Permission <p>Operation permission.</p>
     */
    public KBPermission getPermission() {
        return this.Permission;
    }

    /**
     * Set <p>Operation permission.</p>
     * @param Permission <p>Operation permission.</p>
     */
    public void setPermission(KBPermission Permission) {
        this.Permission = Permission;
    }

    /**
     * Get <p>List of in-processing statuses</p> 
     * @return ProcessingFlagList <p>List of in-processing statuses</p>
     */
    public Long [] getProcessingFlagList() {
        return this.ProcessingFlagList;
    }

    /**
     * Set <p>List of in-processing statuses</p>
     * @param ProcessingFlagList <p>List of in-processing statuses</p>
     */
    public void setProcessingFlagList(Long [] ProcessingFlagList) {
        this.ProcessingFlagList = ProcessingFlagList;
    }

    /**
     * Get <p>Share sub-type: 1=ordinary, 2=wechat official account<table><tbody><tr><td>Enumeration item</td><td>Enumeration value</td><td>Description</td></tr><tr><td>SHARED_KB_SUB_TYPE_UNKNOWN</td><td>0</td><td></td></tr><tr><td>SHARED_KB_SUB_TYPE_NORMAL</td><td>1</td><td>Ordinary</td></tr><tr><td>SHARED_KB_SUB_TYPE_PUBLIC_ACCOUNT</td><td>2</td><td>WeChat official account</td></tr></tbody></table></p> 
     * @return SharedSubType <p>Share sub-type: 1=ordinary, 2=wechat official account<table><tbody><tr><td>Enumeration item</td><td>Enumeration value</td><td>Description</td></tr><tr><td>SHARED_KB_SUB_TYPE_UNKNOWN</td><td>0</td><td></td></tr><tr><td>SHARED_KB_SUB_TYPE_NORMAL</td><td>1</td><td>Ordinary</td></tr><tr><td>SHARED_KB_SUB_TYPE_PUBLIC_ACCOUNT</td><td>2</td><td>WeChat official account</td></tr></tbody></table></p>
     */
    public Long getSharedSubType() {
        return this.SharedSubType;
    }

    /**
     * Set <p>Share sub-type: 1=ordinary, 2=wechat official account<table><tbody><tr><td>Enumeration item</td><td>Enumeration value</td><td>Description</td></tr><tr><td>SHARED_KB_SUB_TYPE_UNKNOWN</td><td>0</td><td></td></tr><tr><td>SHARED_KB_SUB_TYPE_NORMAL</td><td>1</td><td>Ordinary</td></tr><tr><td>SHARED_KB_SUB_TYPE_PUBLIC_ACCOUNT</td><td>2</td><td>WeChat official account</td></tr></tbody></table></p>
     * @param SharedSubType <p>Share sub-type: 1=ordinary, 2=wechat official account<table><tbody><tr><td>Enumeration item</td><td>Enumeration value</td><td>Description</td></tr><tr><td>SHARED_KB_SUB_TYPE_UNKNOWN</td><td>0</td><td></td></tr><tr><td>SHARED_KB_SUB_TYPE_NORMAL</td><td>1</td><td>Ordinary</td></tr><tr><td>SHARED_KB_SUB_TYPE_PUBLIC_ACCOUNT</td><td>2</td><td>WeChat official account</td></tr></tbody></table></p>
     */
    public void setSharedSubType(Long SharedSubType) {
        this.SharedSubType = SharedSubType;
    }

    /**
     * Get <p>Update time (Unix seconds)</p> 
     * @return UpdateTime <p>Update time (Unix seconds)</p>
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set <p>Update time (Unix seconds)</p>
     * @param UpdateTime <p>Update time (Unix seconds)</p>
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get <p>Knowledge base space share information</p> 
     * @return SpaceShare <p>Knowledge base space share information</p>
     */
    public KBSpaceShare getSpaceShare() {
        return this.SpaceShare;
    }

    /**
     * Set <p>Knowledge base space share information</p>
     * @param SpaceShare <p>Knowledge base space share information</p>
     */
    public void setSpaceShare(KBSpaceShare SpaceShare) {
        this.SpaceShare = SpaceShare;
    }

    public KBSummary() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public KBSummary(KBSummary source) {
        if (source.AppList != null) {
            this.AppList = new Identity[source.AppList.length];
            for (int i = 0; i < source.AppList.length; i++) {
                this.AppList[i] = new Identity(source.AppList[i]);
            }
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.Creator != null) {
            this.Creator = new Operator(source.Creator);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.DocCount != null) {
            this.DocCount = new Long(source.DocCount);
        }
        if (source.IsExceeded != null) {
            this.IsExceeded = new Boolean(source.IsExceeded);
        }
        if (source.KbId != null) {
            this.KbId = new String(source.KbId);
        }
        if (source.KbType != null) {
            this.KbType = new Long(source.KbType);
        }
        if (source.LatestOperator != null) {
            this.LatestOperator = new Operator(source.LatestOperator);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Permission != null) {
            this.Permission = new KBPermission(source.Permission);
        }
        if (source.ProcessingFlagList != null) {
            this.ProcessingFlagList = new Long[source.ProcessingFlagList.length];
            for (int i = 0; i < source.ProcessingFlagList.length; i++) {
                this.ProcessingFlagList[i] = new Long(source.ProcessingFlagList[i]);
            }
        }
        if (source.SharedSubType != null) {
            this.SharedSubType = new Long(source.SharedSubType);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
        if (source.SpaceShare != null) {
            this.SpaceShare = new KBSpaceShare(source.SpaceShare);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "AppList.", this.AppList);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamObj(map, prefix + "Creator.", this.Creator);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "DocCount", this.DocCount);
        this.setParamSimple(map, prefix + "IsExceeded", this.IsExceeded);
        this.setParamSimple(map, prefix + "KbId", this.KbId);
        this.setParamSimple(map, prefix + "KbType", this.KbType);
        this.setParamObj(map, prefix + "LatestOperator.", this.LatestOperator);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamObj(map, prefix + "Permission.", this.Permission);
        this.setParamArraySimple(map, prefix + "ProcessingFlagList.", this.ProcessingFlagList);
        this.setParamSimple(map, prefix + "SharedSubType", this.SharedSubType);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamObj(map, prefix + "SpaceShare.", this.SpaceShare);

    }
}

