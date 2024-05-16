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
package com.tencentcloudapi.billing.v20180709.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AnalyseDetail extends AbstractModel {

    /**
    * Time
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Amount
    */
    @SerializedName("Total")
    @Expose
    private String Total;

    /**
    * Date detailed amountNote: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TimeDetail")
    @Expose
    private AnalyseTimeDetail [] TimeDetail;

    /**
     * Get Time 
     * @return Name Time
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Time
     * @param Name Time
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Amount 
     * @return Total Amount
     */
    public String getTotal() {
        return this.Total;
    }

    /**
     * Set Amount
     * @param Total Amount
     */
    public void setTotal(String Total) {
        this.Total = Total;
    }

    /**
     * Get Date detailed amountNote: This field may return null, indicating that no valid values can be obtained. 
     * @return TimeDetail Date detailed amountNote: This field may return null, indicating that no valid values can be obtained.
     */
    public AnalyseTimeDetail [] getTimeDetail() {
        return this.TimeDetail;
    }

    /**
     * Set Date detailed amountNote: This field may return null, indicating that no valid values can be obtained.
     * @param TimeDetail Date detailed amountNote: This field may return null, indicating that no valid values can be obtained.
     */
    public void setTimeDetail(AnalyseTimeDetail [] TimeDetail) {
        this.TimeDetail = TimeDetail;
    }

    public AnalyseDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AnalyseDetail(AnalyseDetail source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Total != null) {
            this.Total = new String(source.Total);
        }
        if (source.TimeDetail != null) {
            this.TimeDetail = new AnalyseTimeDetail[source.TimeDetail.length];
            for (int i = 0; i < source.TimeDetail.length; i++) {
                this.TimeDetail[i] = new AnalyseTimeDetail(source.TimeDetail[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Total", this.Total);
        this.setParamArrayObj(map, prefix + "TimeDetail.", this.TimeDetail);

    }
}

