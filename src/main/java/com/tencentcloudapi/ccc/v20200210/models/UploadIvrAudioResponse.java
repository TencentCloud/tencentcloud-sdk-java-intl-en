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
package com.tencentcloudapi.ccc.v20200210.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UploadIvrAudioResponse extends AbstractModel {

    /**
    * List of files that failed to be uploaded.
    */
    @SerializedName("FailedFileList")
    @Expose
    private UploadIvrAudioFailedInfo [] FailedFileList;

    /**
    * List of successfully uploaded files.
    */
    @SerializedName("SuccessFileList")
    @Expose
    private AudioFileInfo [] SuccessFileList;

    /**
    * The unique request ID, generated by the server, will be returned for every request (if the request fails to reach the server for other reasons, the request will not obtain a RequestId). RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get List of files that failed to be uploaded. 
     * @return FailedFileList List of files that failed to be uploaded.
     */
    public UploadIvrAudioFailedInfo [] getFailedFileList() {
        return this.FailedFileList;
    }

    /**
     * Set List of files that failed to be uploaded.
     * @param FailedFileList List of files that failed to be uploaded.
     */
    public void setFailedFileList(UploadIvrAudioFailedInfo [] FailedFileList) {
        this.FailedFileList = FailedFileList;
    }

    /**
     * Get List of successfully uploaded files. 
     * @return SuccessFileList List of successfully uploaded files.
     */
    public AudioFileInfo [] getSuccessFileList() {
        return this.SuccessFileList;
    }

    /**
     * Set List of successfully uploaded files.
     * @param SuccessFileList List of successfully uploaded files.
     */
    public void setSuccessFileList(AudioFileInfo [] SuccessFileList) {
        this.SuccessFileList = SuccessFileList;
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

    public UploadIvrAudioResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UploadIvrAudioResponse(UploadIvrAudioResponse source) {
        if (source.FailedFileList != null) {
            this.FailedFileList = new UploadIvrAudioFailedInfo[source.FailedFileList.length];
            for (int i = 0; i < source.FailedFileList.length; i++) {
                this.FailedFileList[i] = new UploadIvrAudioFailedInfo(source.FailedFileList[i]);
            }
        }
        if (source.SuccessFileList != null) {
            this.SuccessFileList = new AudioFileInfo[source.SuccessFileList.length];
            for (int i = 0; i < source.SuccessFileList.length; i++) {
                this.SuccessFileList[i] = new AudioFileInfo(source.SuccessFileList[i]);
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
        this.setParamArrayObj(map, prefix + "FailedFileList.", this.FailedFileList);
        this.setParamArrayObj(map, prefix + "SuccessFileList.", this.SuccessFileList);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

