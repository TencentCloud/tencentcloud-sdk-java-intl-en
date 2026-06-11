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
package com.tencentcloudapi.tcss.v20201101.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class VirusWhiteListRuleInfo extends AbstractModel {

    /**
    * <p>Allowlist ID.</p>
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * <p>MD5 allowlist content.</p>
    */
    @SerializedName("Md5List")
    @Expose
    private String [] Md5List;

    /**
    * <p>Image ID.</p>
    */
    @SerializedName("ImageIds")
    @Expose
    private String [] ImageIds;

    /**
    * <p>Scope.</p>
    */
    @SerializedName("Scope")
    @Expose
    private Long Scope;

    /**
    * <p>Number of images.</p>
    */
    @SerializedName("ImageCount")
    @Expose
    private Long ImageCount;

    /**
    * <p>MD5 count.</p>
    */
    @SerializedName("Md5Count")
    @Expose
    private Long Md5Count;

    /**
    * <p>Mark.</p>
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * <p>Insertion time.</p>
    */
    @SerializedName("InsertTime")
    @Expose
    private String InsertTime;

    /**
    * <p>Update time.</p>
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
     * Get <p>Allowlist ID.</p> 
     * @return Id <p>Allowlist ID.</p>
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set <p>Allowlist ID.</p>
     * @param Id <p>Allowlist ID.</p>
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get <p>MD5 allowlist content.</p> 
     * @return Md5List <p>MD5 allowlist content.</p>
     */
    public String [] getMd5List() {
        return this.Md5List;
    }

    /**
     * Set <p>MD5 allowlist content.</p>
     * @param Md5List <p>MD5 allowlist content.</p>
     */
    public void setMd5List(String [] Md5List) {
        this.Md5List = Md5List;
    }

    /**
     * Get <p>Image ID.</p> 
     * @return ImageIds <p>Image ID.</p>
     */
    public String [] getImageIds() {
        return this.ImageIds;
    }

    /**
     * Set <p>Image ID.</p>
     * @param ImageIds <p>Image ID.</p>
     */
    public void setImageIds(String [] ImageIds) {
        this.ImageIds = ImageIds;
    }

    /**
     * Get <p>Scope.</p> 
     * @return Scope <p>Scope.</p>
     */
    public Long getScope() {
        return this.Scope;
    }

    /**
     * Set <p>Scope.</p>
     * @param Scope <p>Scope.</p>
     */
    public void setScope(Long Scope) {
        this.Scope = Scope;
    }

    /**
     * Get <p>Number of images.</p> 
     * @return ImageCount <p>Number of images.</p>
     */
    public Long getImageCount() {
        return this.ImageCount;
    }

    /**
     * Set <p>Number of images.</p>
     * @param ImageCount <p>Number of images.</p>
     */
    public void setImageCount(Long ImageCount) {
        this.ImageCount = ImageCount;
    }

    /**
     * Get <p>MD5 count.</p> 
     * @return Md5Count <p>MD5 count.</p>
     */
    public Long getMd5Count() {
        return this.Md5Count;
    }

    /**
     * Set <p>MD5 count.</p>
     * @param Md5Count <p>MD5 count.</p>
     */
    public void setMd5Count(Long Md5Count) {
        this.Md5Count = Md5Count;
    }

    /**
     * Get <p>Mark.</p> 
     * @return Remark <p>Mark.</p>
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set <p>Mark.</p>
     * @param Remark <p>Mark.</p>
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    /**
     * Get <p>Insertion time.</p> 
     * @return InsertTime <p>Insertion time.</p>
     */
    public String getInsertTime() {
        return this.InsertTime;
    }

    /**
     * Set <p>Insertion time.</p>
     * @param InsertTime <p>Insertion time.</p>
     */
    public void setInsertTime(String InsertTime) {
        this.InsertTime = InsertTime;
    }

    /**
     * Get <p>Update time.</p> 
     * @return UpdateTime <p>Update time.</p>
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set <p>Update time.</p>
     * @param UpdateTime <p>Update time.</p>
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    public VirusWhiteListRuleInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public VirusWhiteListRuleInfo(VirusWhiteListRuleInfo source) {
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.Md5List != null) {
            this.Md5List = new String[source.Md5List.length];
            for (int i = 0; i < source.Md5List.length; i++) {
                this.Md5List[i] = new String(source.Md5List[i]);
            }
        }
        if (source.ImageIds != null) {
            this.ImageIds = new String[source.ImageIds.length];
            for (int i = 0; i < source.ImageIds.length; i++) {
                this.ImageIds[i] = new String(source.ImageIds[i]);
            }
        }
        if (source.Scope != null) {
            this.Scope = new Long(source.Scope);
        }
        if (source.ImageCount != null) {
            this.ImageCount = new Long(source.ImageCount);
        }
        if (source.Md5Count != null) {
            this.Md5Count = new Long(source.Md5Count);
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
        if (source.InsertTime != null) {
            this.InsertTime = new String(source.InsertTime);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamArraySimple(map, prefix + "Md5List.", this.Md5List);
        this.setParamArraySimple(map, prefix + "ImageIds.", this.ImageIds);
        this.setParamSimple(map, prefix + "Scope", this.Scope);
        this.setParamSimple(map, prefix + "ImageCount", this.ImageCount);
        this.setParamSimple(map, prefix + "Md5Count", this.Md5Count);
        this.setParamSimple(map, prefix + "Remark", this.Remark);
        this.setParamSimple(map, prefix + "InsertTime", this.InsertTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);

    }
}

