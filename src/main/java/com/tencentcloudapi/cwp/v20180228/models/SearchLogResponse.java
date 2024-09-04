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
package com.tencentcloudapi.cwp.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SearchLogResponse extends AbstractModel {

    /**
    * Number of raw logs matching the retrieval criteria
    */
    @SerializedName("Count")
    @Expose
    private Long Count;

    /**
    * Pass through the Context value returned by this API, which can access more logs later, with an expiration time of 1 hour.
    */
    @SerializedName("Context")
    @Expose
    private String Context;

    /**
    * Whether all logs meeting the retrieval criteria have been returned. If not, use the Context parameter to retrieve more logs.
    */
    @SerializedName("ListOver")
    @Expose
    private Boolean ListOver;

    /**
    * Whether the returned data is the SQL analysis result
    */
    @SerializedName("Analysis")
    @Expose
    private Boolean Analysis;

    /**
    * Raw logs matching the retrieval criteria
    */
    @SerializedName("Data")
    @Expose
    private LogInfo [] Data;

    /**
    * The unique request ID, generated by the server, will be returned for every request (if the request fails to reach the server for other reasons, the request will not obtain a RequestId). RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Number of raw logs matching the retrieval criteria 
     * @return Count Number of raw logs matching the retrieval criteria
     */
    public Long getCount() {
        return this.Count;
    }

    /**
     * Set Number of raw logs matching the retrieval criteria
     * @param Count Number of raw logs matching the retrieval criteria
     */
    public void setCount(Long Count) {
        this.Count = Count;
    }

    /**
     * Get Pass through the Context value returned by this API, which can access more logs later, with an expiration time of 1 hour. 
     * @return Context Pass through the Context value returned by this API, which can access more logs later, with an expiration time of 1 hour.
     */
    public String getContext() {
        return this.Context;
    }

    /**
     * Set Pass through the Context value returned by this API, which can access more logs later, with an expiration time of 1 hour.
     * @param Context Pass through the Context value returned by this API, which can access more logs later, with an expiration time of 1 hour.
     */
    public void setContext(String Context) {
        this.Context = Context;
    }

    /**
     * Get Whether all logs meeting the retrieval criteria have been returned. If not, use the Context parameter to retrieve more logs. 
     * @return ListOver Whether all logs meeting the retrieval criteria have been returned. If not, use the Context parameter to retrieve more logs.
     */
    public Boolean getListOver() {
        return this.ListOver;
    }

    /**
     * Set Whether all logs meeting the retrieval criteria have been returned. If not, use the Context parameter to retrieve more logs.
     * @param ListOver Whether all logs meeting the retrieval criteria have been returned. If not, use the Context parameter to retrieve more logs.
     */
    public void setListOver(Boolean ListOver) {
        this.ListOver = ListOver;
    }

    /**
     * Get Whether the returned data is the SQL analysis result 
     * @return Analysis Whether the returned data is the SQL analysis result
     */
    public Boolean getAnalysis() {
        return this.Analysis;
    }

    /**
     * Set Whether the returned data is the SQL analysis result
     * @param Analysis Whether the returned data is the SQL analysis result
     */
    public void setAnalysis(Boolean Analysis) {
        this.Analysis = Analysis;
    }

    /**
     * Get Raw logs matching the retrieval criteria 
     * @return Data Raw logs matching the retrieval criteria
     */
    public LogInfo [] getData() {
        return this.Data;
    }

    /**
     * Set Raw logs matching the retrieval criteria
     * @param Data Raw logs matching the retrieval criteria
     */
    public void setData(LogInfo [] Data) {
        this.Data = Data;
    }

    /**
     * Get The unique request ID, generated by the server, will be returned for every request (if the request fails to reach the server for other reasons, the request will not obtain a RequestId). RequestId is required for locating a problem. 
     * @return RequestId The unique request ID, generated by the server, will be returned for every request (if the request fails to reach the server for other reasons, the request will not obtain a RequestId). RequestId is required for locating a problem.
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set The unique request ID, generated by the server, will be returned for every request (if the request fails to reach the server for other reasons, the request will not obtain a RequestId). RequestId is required for locating a problem.
     * @param RequestId The unique request ID, generated by the server, will be returned for every request (if the request fails to reach the server for other reasons, the request will not obtain a RequestId). RequestId is required for locating a problem.
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public SearchLogResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SearchLogResponse(SearchLogResponse source) {
        if (source.Count != null) {
            this.Count = new Long(source.Count);
        }
        if (source.Context != null) {
            this.Context = new String(source.Context);
        }
        if (source.ListOver != null) {
            this.ListOver = new Boolean(source.ListOver);
        }
        if (source.Analysis != null) {
            this.Analysis = new Boolean(source.Analysis);
        }
        if (source.Data != null) {
            this.Data = new LogInfo[source.Data.length];
            for (int i = 0; i < source.Data.length; i++) {
                this.Data[i] = new LogInfo(source.Data[i]);
            }
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Count", this.Count);
        this.setParamSimple(map, prefix + "Context", this.Context);
        this.setParamSimple(map, prefix + "ListOver", this.ListOver);
        this.setParamSimple(map, prefix + "Analysis", this.Analysis);
        this.setParamArrayObj(map, prefix + "Data.", this.Data);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}
