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
package com.tencentcloudapi.cdb.v20170320.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AuditInstanceInfo extends AbstractModel {

    /**
    * Project ID.
    */
    @SerializedName("ProjectId")
    @Expose
    private Long ProjectId;

    /**
    * Tag information.
    */
    @SerializedName("TagList")
    @Expose
    private TagInfoUnit [] TagList;

    /**
    * Database engine type.
    */
    @SerializedName("DbType")
    @Expose
    private String DbType;

    /**
    * Database engine version.
    */
    @SerializedName("DbVersion")
    @Expose
    private String DbVersion;

    /**
     * Get Project ID. 
     * @return ProjectId Project ID.
     */
    public Long getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set Project ID.
     * @param ProjectId Project ID.
     */
    public void setProjectId(Long ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get Tag information. 
     * @return TagList Tag information.
     */
    public TagInfoUnit [] getTagList() {
        return this.TagList;
    }

    /**
     * Set Tag information.
     * @param TagList Tag information.
     */
    public void setTagList(TagInfoUnit [] TagList) {
        this.TagList = TagList;
    }

    /**
     * Get Database engine type. 
     * @return DbType Database engine type.
     */
    public String getDbType() {
        return this.DbType;
    }

    /**
     * Set Database engine type.
     * @param DbType Database engine type.
     */
    public void setDbType(String DbType) {
        this.DbType = DbType;
    }

    /**
     * Get Database engine version. 
     * @return DbVersion Database engine version.
     */
    public String getDbVersion() {
        return this.DbVersion;
    }

    /**
     * Set Database engine version.
     * @param DbVersion Database engine version.
     */
    public void setDbVersion(String DbVersion) {
        this.DbVersion = DbVersion;
    }

    public AuditInstanceInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AuditInstanceInfo(AuditInstanceInfo source) {
        if (source.ProjectId != null) {
            this.ProjectId = new Long(source.ProjectId);
        }
        if (source.TagList != null) {
            this.TagList = new TagInfoUnit[source.TagList.length];
            for (int i = 0; i < source.TagList.length; i++) {
                this.TagList[i] = new TagInfoUnit(source.TagList[i]);
            }
        }
        if (source.DbType != null) {
            this.DbType = new String(source.DbType);
        }
        if (source.DbVersion != null) {
            this.DbVersion = new String(source.DbVersion);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamArrayObj(map, prefix + "TagList.", this.TagList);
        this.setParamSimple(map, prefix + "DbType", this.DbType);
        this.setParamSimple(map, prefix + "DbVersion", this.DbVersion);

    }
}

