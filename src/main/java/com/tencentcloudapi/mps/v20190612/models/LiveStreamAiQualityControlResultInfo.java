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
package com.tencentcloudapi.mps.v20190612.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class LiveStreamAiQualityControlResultInfo extends AbstractModel {

    /**
    * Content quality inspection result list.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("QualityControlResults")
    @Expose
    private QualityControlResult [] QualityControlResults;

    /**
    * 
    */
    @SerializedName("DiagnoseResults")
    @Expose
    private DiagnoseResult [] DiagnoseResults;

    /**
    * Content quality inspection result list.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("QualityControlResultSet")
    @Expose
    private QualityControlResult [] QualityControlResultSet;

    /**
    * Format diagnostic result list.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("DiagnoseResultSet")
    @Expose
    private DiagnoseResult [] DiagnoseResultSet;

    /**
     * Get Content quality inspection result list.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return QualityControlResults Content quality inspection result list.
Note: This field may return null, indicating that no valid values can be obtained.
     * @deprecated
     */
    @Deprecated
    public QualityControlResult [] getQualityControlResults() {
        return this.QualityControlResults;
    }

    /**
     * Set Content quality inspection result list.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param QualityControlResults Content quality inspection result list.
Note: This field may return null, indicating that no valid values can be obtained.
     * @deprecated
     */
    @Deprecated
    public void setQualityControlResults(QualityControlResult [] QualityControlResults) {
        this.QualityControlResults = QualityControlResults;
    }

    /**
     * Get  
     * @return DiagnoseResults 
     * @deprecated
     */
    @Deprecated
    public DiagnoseResult [] getDiagnoseResults() {
        return this.DiagnoseResults;
    }

    /**
     * Set 
     * @param DiagnoseResults 
     * @deprecated
     */
    @Deprecated
    public void setDiagnoseResults(DiagnoseResult [] DiagnoseResults) {
        this.DiagnoseResults = DiagnoseResults;
    }

    /**
     * Get Content quality inspection result list.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return QualityControlResultSet Content quality inspection result list.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public QualityControlResult [] getQualityControlResultSet() {
        return this.QualityControlResultSet;
    }

    /**
     * Set Content quality inspection result list.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param QualityControlResultSet Content quality inspection result list.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setQualityControlResultSet(QualityControlResult [] QualityControlResultSet) {
        this.QualityControlResultSet = QualityControlResultSet;
    }

    /**
     * Get Format diagnostic result list.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return DiagnoseResultSet Format diagnostic result list.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public DiagnoseResult [] getDiagnoseResultSet() {
        return this.DiagnoseResultSet;
    }

    /**
     * Set Format diagnostic result list.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param DiagnoseResultSet Format diagnostic result list.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setDiagnoseResultSet(DiagnoseResult [] DiagnoseResultSet) {
        this.DiagnoseResultSet = DiagnoseResultSet;
    }

    public LiveStreamAiQualityControlResultInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public LiveStreamAiQualityControlResultInfo(LiveStreamAiQualityControlResultInfo source) {
        if (source.QualityControlResults != null) {
            this.QualityControlResults = new QualityControlResult[source.QualityControlResults.length];
            for (int i = 0; i < source.QualityControlResults.length; i++) {
                this.QualityControlResults[i] = new QualityControlResult(source.QualityControlResults[i]);
            }
        }
        if (source.DiagnoseResults != null) {
            this.DiagnoseResults = new DiagnoseResult[source.DiagnoseResults.length];
            for (int i = 0; i < source.DiagnoseResults.length; i++) {
                this.DiagnoseResults[i] = new DiagnoseResult(source.DiagnoseResults[i]);
            }
        }
        if (source.QualityControlResultSet != null) {
            this.QualityControlResultSet = new QualityControlResult[source.QualityControlResultSet.length];
            for (int i = 0; i < source.QualityControlResultSet.length; i++) {
                this.QualityControlResultSet[i] = new QualityControlResult(source.QualityControlResultSet[i]);
            }
        }
        if (source.DiagnoseResultSet != null) {
            this.DiagnoseResultSet = new DiagnoseResult[source.DiagnoseResultSet.length];
            for (int i = 0; i < source.DiagnoseResultSet.length; i++) {
                this.DiagnoseResultSet[i] = new DiagnoseResult(source.DiagnoseResultSet[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "QualityControlResults.", this.QualityControlResults);
        this.setParamArrayObj(map, prefix + "DiagnoseResults.", this.DiagnoseResults);
        this.setParamArrayObj(map, prefix + "QualityControlResultSet.", this.QualityControlResultSet);
        this.setParamArrayObj(map, prefix + "DiagnoseResultSet.", this.DiagnoseResultSet);

    }
}

