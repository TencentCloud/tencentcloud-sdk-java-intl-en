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
    * The StatementID value is fixed as 0 in the monitoring dashboard.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("StatementID")
    @Expose
    private Long StatementID;

    /**
    * Query result data is returned in Columns-Values format.	
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Series")
    @Expose
    private SeriesInfos [] Series;

    /**
    * The Total value is fixed as 1 in the dashboard feature monitoring.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Total")
    @Expose
    private Long Total;

    /**
     * Get The StatementID value is fixed as 0 in the monitoring dashboard.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return StatementID The StatementID value is fixed as 0 in the monitoring dashboard.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getStatementID() {
        return this.StatementID;
    }

    /**
     * Set The StatementID value is fixed as 0 in the monitoring dashboard.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param StatementID The StatementID value is fixed as 0 in the monitoring dashboard.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setStatementID(Long StatementID) {
        this.StatementID = StatementID;
    }

    /**
     * Get Query result data is returned in Columns-Values format.	
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Series Query result data is returned in Columns-Values format.	
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public SeriesInfos [] getSeries() {
        return this.Series;
    }

    /**
     * Set Query result data is returned in Columns-Values format.	
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Series Query result data is returned in Columns-Values format.	
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setSeries(SeriesInfos [] Series) {
        this.Series = Series;
    }

    /**
     * Get The Total value is fixed as 1 in the dashboard feature monitoring.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Total The Total value is fixed as 1 in the dashboard feature monitoring.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getTotal() {
        return this.Total;
    }

    /**
     * Set The Total value is fixed as 1 in the dashboard feature monitoring.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Total The Total value is fixed as 1 in the dashboard feature monitoring.
Note: This field may return null, indicating that no valid values can be obtained.
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

