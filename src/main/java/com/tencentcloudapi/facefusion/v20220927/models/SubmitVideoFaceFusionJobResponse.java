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
package com.tencentcloudapi.facefusion.v20220927.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SubmitVideoFaceFusionJobResponse extends AbstractModel {

    /**
    * Job ID of the video face fusion task
    */
    @SerializedName("JobId")
    @Expose
    private String JobId;

    /**
    * Estimated processing time of the video face fusion task, in seconds
    */
    @SerializedName("EstimatedProcessTime")
    @Expose
    private Float EstimatedProcessTime;

    /**
    * Estimated processing time of the video face fusion task, in seconds
    */
    @SerializedName("JobQueueLength")
    @Expose
    private Long JobQueueLength;

    /**
    * Inappropriate content recognition result. The element order of this array is the same as that of mergeinfo in the request, with a one-to-one relationship.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ReviewResultSet")
    @Expose
    private FuseFaceReviewResult [] ReviewResultSet;

    /**
    * The unique request ID, generated by the server, will be returned for every request (if the request fails to reach the server for other reasons, the request will not obtain a RequestId). RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Job ID of the video face fusion task 
     * @return JobId Job ID of the video face fusion task
     */
    public String getJobId() {
        return this.JobId;
    }

    /**
     * Set Job ID of the video face fusion task
     * @param JobId Job ID of the video face fusion task
     */
    public void setJobId(String JobId) {
        this.JobId = JobId;
    }

    /**
     * Get Estimated processing time of the video face fusion task, in seconds 
     * @return EstimatedProcessTime Estimated processing time of the video face fusion task, in seconds
     */
    public Float getEstimatedProcessTime() {
        return this.EstimatedProcessTime;
    }

    /**
     * Set Estimated processing time of the video face fusion task, in seconds
     * @param EstimatedProcessTime Estimated processing time of the video face fusion task, in seconds
     */
    public void setEstimatedProcessTime(Float EstimatedProcessTime) {
        this.EstimatedProcessTime = EstimatedProcessTime;
    }

    /**
     * Get Estimated processing time of the video face fusion task, in seconds 
     * @return JobQueueLength Estimated processing time of the video face fusion task, in seconds
     */
    public Long getJobQueueLength() {
        return this.JobQueueLength;
    }

    /**
     * Set Estimated processing time of the video face fusion task, in seconds
     * @param JobQueueLength Estimated processing time of the video face fusion task, in seconds
     */
    public void setJobQueueLength(Long JobQueueLength) {
        this.JobQueueLength = JobQueueLength;
    }

    /**
     * Get Inappropriate content recognition result. The element order of this array is the same as that of mergeinfo in the request, with a one-to-one relationship.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ReviewResultSet Inappropriate content recognition result. The element order of this array is the same as that of mergeinfo in the request, with a one-to-one relationship.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public FuseFaceReviewResult [] getReviewResultSet() {
        return this.ReviewResultSet;
    }

    /**
     * Set Inappropriate content recognition result. The element order of this array is the same as that of mergeinfo in the request, with a one-to-one relationship.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ReviewResultSet Inappropriate content recognition result. The element order of this array is the same as that of mergeinfo in the request, with a one-to-one relationship.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setReviewResultSet(FuseFaceReviewResult [] ReviewResultSet) {
        this.ReviewResultSet = ReviewResultSet;
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

    public SubmitVideoFaceFusionJobResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SubmitVideoFaceFusionJobResponse(SubmitVideoFaceFusionJobResponse source) {
        if (source.JobId != null) {
            this.JobId = new String(source.JobId);
        }
        if (source.EstimatedProcessTime != null) {
            this.EstimatedProcessTime = new Float(source.EstimatedProcessTime);
        }
        if (source.JobQueueLength != null) {
            this.JobQueueLength = new Long(source.JobQueueLength);
        }
        if (source.ReviewResultSet != null) {
            this.ReviewResultSet = new FuseFaceReviewResult[source.ReviewResultSet.length];
            for (int i = 0; i < source.ReviewResultSet.length; i++) {
                this.ReviewResultSet[i] = new FuseFaceReviewResult(source.ReviewResultSet[i]);
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
        this.setParamSimple(map, prefix + "JobId", this.JobId);
        this.setParamSimple(map, prefix + "EstimatedProcessTime", this.EstimatedProcessTime);
        this.setParamSimple(map, prefix + "JobQueueLength", this.JobQueueLength);
        this.setParamArrayObj(map, prefix + "ReviewResultSet.", this.ReviewResultSet);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

