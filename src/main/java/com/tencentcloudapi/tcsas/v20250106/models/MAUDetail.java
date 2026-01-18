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
package com.tencentcloudapi.tcsas.v20250106.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class MAUDetail extends AbstractModel {

    /**
    * Mini program name
    */
    @SerializedName("MNPName")
    @Expose
    private String MNPName;

    /**
    * MAU details
    */
    @SerializedName("DataList")
    @Expose
    private MAULineChartData [] DataList;

    /**
     * Get Mini program name 
     * @return MNPName Mini program name
     */
    public String getMNPName() {
        return this.MNPName;
    }

    /**
     * Set Mini program name
     * @param MNPName Mini program name
     */
    public void setMNPName(String MNPName) {
        this.MNPName = MNPName;
    }

    /**
     * Get MAU details 
     * @return DataList MAU details
     */
    public MAULineChartData [] getDataList() {
        return this.DataList;
    }

    /**
     * Set MAU details
     * @param DataList MAU details
     */
    public void setDataList(MAULineChartData [] DataList) {
        this.DataList = DataList;
    }

    public MAUDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MAUDetail(MAUDetail source) {
        if (source.MNPName != null) {
            this.MNPName = new String(source.MNPName);
        }
        if (source.DataList != null) {
            this.DataList = new MAULineChartData[source.DataList.length];
            for (int i = 0; i < source.DataList.length; i++) {
                this.DataList[i] = new MAULineChartData(source.DataList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MNPName", this.MNPName);
        this.setParamArrayObj(map, prefix + "DataList.", this.DataList);

    }
}

