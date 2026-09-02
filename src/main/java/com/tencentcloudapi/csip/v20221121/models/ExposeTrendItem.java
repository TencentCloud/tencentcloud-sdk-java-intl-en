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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ExposeTrendItem extends AbstractModel {

    /**
    * Number of fully open ports
    */
    @SerializedName("OpenCount")
    @Expose
    private Long OpenCount;

    /**
    * Number of restricted accesses
    */
    @SerializedName("AclCount")
    @Expose
    private Long AclCount;

    /**
    * Number of inaccessible instances
    */
    @SerializedName("CloseCount")
    @Expose
    private Long CloseCount;

    /**
    * Date
    */
    @SerializedName("Date")
    @Expose
    private String Date;

    /**
     * Get Number of fully open ports 
     * @return OpenCount Number of fully open ports
     */
    public Long getOpenCount() {
        return this.OpenCount;
    }

    /**
     * Set Number of fully open ports
     * @param OpenCount Number of fully open ports
     */
    public void setOpenCount(Long OpenCount) {
        this.OpenCount = OpenCount;
    }

    /**
     * Get Number of restricted accesses 
     * @return AclCount Number of restricted accesses
     */
    public Long getAclCount() {
        return this.AclCount;
    }

    /**
     * Set Number of restricted accesses
     * @param AclCount Number of restricted accesses
     */
    public void setAclCount(Long AclCount) {
        this.AclCount = AclCount;
    }

    /**
     * Get Number of inaccessible instances 
     * @return CloseCount Number of inaccessible instances
     */
    public Long getCloseCount() {
        return this.CloseCount;
    }

    /**
     * Set Number of inaccessible instances
     * @param CloseCount Number of inaccessible instances
     */
    public void setCloseCount(Long CloseCount) {
        this.CloseCount = CloseCount;
    }

    /**
     * Get Date 
     * @return Date Date
     */
    public String getDate() {
        return this.Date;
    }

    /**
     * Set Date
     * @param Date Date
     */
    public void setDate(String Date) {
        this.Date = Date;
    }

    public ExposeTrendItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ExposeTrendItem(ExposeTrendItem source) {
        if (source.OpenCount != null) {
            this.OpenCount = new Long(source.OpenCount);
        }
        if (source.AclCount != null) {
            this.AclCount = new Long(source.AclCount);
        }
        if (source.CloseCount != null) {
            this.CloseCount = new Long(source.CloseCount);
        }
        if (source.Date != null) {
            this.Date = new String(source.Date);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "OpenCount", this.OpenCount);
        this.setParamSimple(map, prefix + "AclCount", this.AclCount);
        this.setParamSimple(map, prefix + "CloseCount", this.CloseCount);
        this.setParamSimple(map, prefix + "Date", this.Date);

    }
}

