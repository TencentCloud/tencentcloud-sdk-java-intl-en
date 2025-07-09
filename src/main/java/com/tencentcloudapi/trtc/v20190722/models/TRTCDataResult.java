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
package com.tencentcloudapi.trtc.v20190722.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TRTCDataResult extends AbstractModel {

    /**
    * StatementID value, fixed at 0 for Monitoring Dashboard.
    */
    @SerializedName("StatementID")
    @Expose
    private Long StatementID;

    /**
    * Query result data, returned in Columns-Values format.
    */
    @SerializedName("Series")
    @Expose
    private SeriesInfos [] Series;

    /**
    * Total value, fixed at 1 for Monitoring Dashboard.
    */
    @SerializedName("Total")
    @Expose
    private Long Total;

    /**
     * Get StatementID value, fixed at 0 for Monitoring Dashboard. 
     * @return StatementID StatementID value, fixed at 0 for Monitoring Dashboard.
     */
    public Long getStatementID() {
        return this.StatementID;
    }

    /**
     * Set StatementID value, fixed at 0 for Monitoring Dashboard.
     * @param StatementID StatementID value, fixed at 0 for Monitoring Dashboard.
     */
    public void setStatementID(Long StatementID) {
        this.StatementID = StatementID;
    }

    /**
     * Get Query result data, returned in Columns-Values format. 
     * @return Series Query result data, returned in Columns-Values format.
     */
    public SeriesInfos [] getSeries() {
        return this.Series;
    }

    /**
     * Set Query result data, returned in Columns-Values format.
     * @param Series Query result data, returned in Columns-Values format.
     */
    public void setSeries(SeriesInfos [] Series) {
        this.Series = Series;
    }

    /**
     * Get Total value, fixed at 1 for Monitoring Dashboard. 
     * @return Total Total value, fixed at 1 for Monitoring Dashboard.
     */
    public Long getTotal() {
        return this.Total;
    }

    /**
     * Set Total value, fixed at 1 for Monitoring Dashboard.
     * @param Total Total value, fixed at 1 for Monitoring Dashboard.
     */
    public void setTotal(Long Total) {
        this.Total = Total;
    }

    public TRTCDataResult() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TRTCDataResult(TRTCDataResult source) {
        if (source.StatementID != null) {
            this.StatementID = new Long(source.StatementID);
        }
        if (source.Series != null) {
            this.Series = new SeriesInfos[source.Series.length];
            for (int i = 0; i < source.Series.length; i++) {
                this.Series[i] = new SeriesInfos(source.Series[i]);
            }
        }
        if (source.Total != null) {
            this.Total = new Long(source.Total);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "StatementID", this.StatementID);
        this.setParamArrayObj(map, prefix + "Series.", this.Series);
        this.setParamSimple(map, prefix + "Total", this.Total);

    }
}

