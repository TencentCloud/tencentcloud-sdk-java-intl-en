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
package com.tencentcloudapi.mdp.v20200527.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ProgramAlertCounts extends AbstractModel {

    /**
    * Program ID.
    */
    @SerializedName("ProgramId")
    @Expose
    private String ProgramId;

    /**
    * Program name.
    */
    @SerializedName("ProgramName")
    @Expose
    private String ProgramName;

    /**
    * Alarm classification.
    */
    @SerializedName("Category")
    @Expose
    private String Category;

    /**
    * The number of occurrences
    */
    @SerializedName("Count")
    @Expose
    private Long Count;

    /**
    * Update time.
    */
    @SerializedName("LastModifiedTime")
    @Expose
    private Long LastModifiedTime;

    /**
     * Get Program ID. 
     * @return ProgramId Program ID.
     */
    public String getProgramId() {
        return this.ProgramId;
    }

    /**
     * Set Program ID.
     * @param ProgramId Program ID.
     */
    public void setProgramId(String ProgramId) {
        this.ProgramId = ProgramId;
    }

    /**
     * Get Program name. 
     * @return ProgramName Program name.
     */
    public String getProgramName() {
        return this.ProgramName;
    }

    /**
     * Set Program name.
     * @param ProgramName Program name.
     */
    public void setProgramName(String ProgramName) {
        this.ProgramName = ProgramName;
    }

    /**
     * Get Alarm classification. 
     * @return Category Alarm classification.
     */
    public String getCategory() {
        return this.Category;
    }

    /**
     * Set Alarm classification.
     * @param Category Alarm classification.
     */
    public void setCategory(String Category) {
        this.Category = Category;
    }

    /**
     * Get The number of occurrences 
     * @return Count The number of occurrences
     */
    public Long getCount() {
        return this.Count;
    }

    /**
     * Set The number of occurrences
     * @param Count The number of occurrences
     */
    public void setCount(Long Count) {
        this.Count = Count;
    }

    /**
     * Get Update time. 
     * @return LastModifiedTime Update time.
     */
    public Long getLastModifiedTime() {
        return this.LastModifiedTime;
    }

    /**
     * Set Update time.
     * @param LastModifiedTime Update time.
     */
    public void setLastModifiedTime(Long LastModifiedTime) {
        this.LastModifiedTime = LastModifiedTime;
    }

    public ProgramAlertCounts() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ProgramAlertCounts(ProgramAlertCounts source) {
        if (source.ProgramId != null) {
            this.ProgramId = new String(source.ProgramId);
        }
        if (source.ProgramName != null) {
            this.ProgramName = new String(source.ProgramName);
        }
        if (source.Category != null) {
            this.Category = new String(source.Category);
        }
        if (source.Count != null) {
            this.Count = new Long(source.Count);
        }
        if (source.LastModifiedTime != null) {
            this.LastModifiedTime = new Long(source.LastModifiedTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProgramId", this.ProgramId);
        this.setParamSimple(map, prefix + "ProgramName", this.ProgramName);
        this.setParamSimple(map, prefix + "Category", this.Category);
        this.setParamSimple(map, prefix + "Count", this.Count);
        this.setParamSimple(map, prefix + "LastModifiedTime", this.LastModifiedTime);

    }
}

