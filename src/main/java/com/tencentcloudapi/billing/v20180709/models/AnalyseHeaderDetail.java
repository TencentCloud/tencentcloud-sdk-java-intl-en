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
package com.tencentcloudapi.billing.v20180709.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AnalyseHeaderDetail extends AbstractModel {

    /**
    * Header dateNote: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("HeadDetail")
    @Expose
    private AnalyseHeaderTimeDetail [] HeadDetail;

    /**
    * TimeNote: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * TotalNote: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Total")
    @Expose
    private String Total;

    /**
     * Get Header dateNote: This field may return null, indicating that no valid values can be obtained. 
     * @return HeadDetail Header dateNote: This field may return null, indicating that no valid values can be obtained.
     */
    public AnalyseHeaderTimeDetail [] getHeadDetail() {
        return this.HeadDetail;
    }

    /**
     * Set Header dateNote: This field may return null, indicating that no valid values can be obtained.
     * @param HeadDetail Header dateNote: This field may return null, indicating that no valid values can be obtained.
     */
    public void setHeadDetail(AnalyseHeaderTimeDetail [] HeadDetail) {
        this.HeadDetail = HeadDetail;
    }

    /**
     * Get TimeNote: This field may return null, indicating that no valid values can be obtained. 
     * @return Name TimeNote: This field may return null, indicating that no valid values can be obtained.
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set TimeNote: This field may return null, indicating that no valid values can be obtained.
     * @param Name TimeNote: This field may return null, indicating that no valid values can be obtained.
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get TotalNote: This field may return null, indicating that no valid values can be obtained. 
     * @return Total TotalNote: This field may return null, indicating that no valid values can be obtained.
     */
    public String getTotal() {
        return this.Total;
    }

    /**
     * Set TotalNote: This field may return null, indicating that no valid values can be obtained.
     * @param Total TotalNote: This field may return null, indicating that no valid values can be obtained.
     */
    public void setTotal(String Total) {
        this.Total = Total;
    }

    public AnalyseHeaderDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AnalyseHeaderDetail(AnalyseHeaderDetail source) {
        if (source.HeadDetail != null) {
            this.HeadDetail = new AnalyseHeaderTimeDetail[source.HeadDetail.length];
            for (int i = 0; i < source.HeadDetail.length; i++) {
                this.HeadDetail[i] = new AnalyseHeaderTimeDetail(source.HeadDetail[i]);
            }
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Total != null) {
            this.Total = new String(source.Total);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "HeadDetail.", this.HeadDetail);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Total", this.Total);

    }
}

