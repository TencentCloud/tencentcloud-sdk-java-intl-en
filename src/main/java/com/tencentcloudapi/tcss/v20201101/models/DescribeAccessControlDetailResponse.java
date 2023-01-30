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
package com.tencentcloudapi.tcss.v20201101.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeAccessControlDetailResponse extends AbstractModel{

    /**
    * Basic information of the event
    */
    @SerializedName("EventBaseInfo")
    @Expose
    private RunTimeEventBaseInfo EventBaseInfo;

    /**
    * Process information
    */
    @SerializedName("ProcessInfo")
    @Expose
    private ProcessDetailInfo ProcessInfo;

    /**
    * Information tampered with
    */
    @SerializedName("TamperedFileInfo")
    @Expose
    private FileAttributeInfo TamperedFileInfo;

    /**
    * Event description
    */
    @SerializedName("EventDetail")
    @Expose
    private AccessControlEventDescription EventDetail;

    /**
    * Parent process information
    */
    @SerializedName("ParentProcessInfo")
    @Expose
    private ProcessBaseInfo ParentProcessInfo;

    /**
    * Ancestor process information
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("AncestorProcessInfo")
    @Expose
    private ProcessBaseInfo AncestorProcessInfo;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Basic information of the event 
     * @return EventBaseInfo Basic information of the event
     */
    public RunTimeEventBaseInfo getEventBaseInfo() {
        return this.EventBaseInfo;
    }

    /**
     * Set Basic information of the event
     * @param EventBaseInfo Basic information of the event
     */
    public void setEventBaseInfo(RunTimeEventBaseInfo EventBaseInfo) {
        this.EventBaseInfo = EventBaseInfo;
    }

    /**
     * Get Process information 
     * @return ProcessInfo Process information
     */
    public ProcessDetailInfo getProcessInfo() {
        return this.ProcessInfo;
    }

    /**
     * Set Process information
     * @param ProcessInfo Process information
     */
    public void setProcessInfo(ProcessDetailInfo ProcessInfo) {
        this.ProcessInfo = ProcessInfo;
    }

    /**
     * Get Information tampered with 
     * @return TamperedFileInfo Information tampered with
     */
    public FileAttributeInfo getTamperedFileInfo() {
        return this.TamperedFileInfo;
    }

    /**
     * Set Information tampered with
     * @param TamperedFileInfo Information tampered with
     */
    public void setTamperedFileInfo(FileAttributeInfo TamperedFileInfo) {
        this.TamperedFileInfo = TamperedFileInfo;
    }

    /**
     * Get Event description 
     * @return EventDetail Event description
     */
    public AccessControlEventDescription getEventDetail() {
        return this.EventDetail;
    }

    /**
     * Set Event description
     * @param EventDetail Event description
     */
    public void setEventDetail(AccessControlEventDescription EventDetail) {
        this.EventDetail = EventDetail;
    }

    /**
     * Get Parent process information 
     * @return ParentProcessInfo Parent process information
     */
    public ProcessBaseInfo getParentProcessInfo() {
        return this.ParentProcessInfo;
    }

    /**
     * Set Parent process information
     * @param ParentProcessInfo Parent process information
     */
    public void setParentProcessInfo(ProcessBaseInfo ParentProcessInfo) {
        this.ParentProcessInfo = ParentProcessInfo;
    }

    /**
     * Get Ancestor process information
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return AncestorProcessInfo Ancestor process information
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public ProcessBaseInfo getAncestorProcessInfo() {
        return this.AncestorProcessInfo;
    }

    /**
     * Set Ancestor process information
Note: This field may return null, indicating that no valid values can be obtained.
     * @param AncestorProcessInfo Ancestor process information
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setAncestorProcessInfo(ProcessBaseInfo AncestorProcessInfo) {
        this.AncestorProcessInfo = AncestorProcessInfo;
    }

    /**
     * Get The unique request ID, which is returned for each request. RequestId is required for locating a problem. 
     * @return RequestId The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     * @param RequestId The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public DescribeAccessControlDetailResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeAccessControlDetailResponse(DescribeAccessControlDetailResponse source) {
        if (source.EventBaseInfo != null) {
            this.EventBaseInfo = new RunTimeEventBaseInfo(source.EventBaseInfo);
        }
        if (source.ProcessInfo != null) {
            this.ProcessInfo = new ProcessDetailInfo(source.ProcessInfo);
        }
        if (source.TamperedFileInfo != null) {
            this.TamperedFileInfo = new FileAttributeInfo(source.TamperedFileInfo);
        }
        if (source.EventDetail != null) {
            this.EventDetail = new AccessControlEventDescription(source.EventDetail);
        }
        if (source.ParentProcessInfo != null) {
            this.ParentProcessInfo = new ProcessBaseInfo(source.ParentProcessInfo);
        }
        if (source.AncestorProcessInfo != null) {
            this.AncestorProcessInfo = new ProcessBaseInfo(source.AncestorProcessInfo);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "EventBaseInfo.", this.EventBaseInfo);
        this.setParamObj(map, prefix + "ProcessInfo.", this.ProcessInfo);
        this.setParamObj(map, prefix + "TamperedFileInfo.", this.TamperedFileInfo);
        this.setParamObj(map, prefix + "EventDetail.", this.EventDetail);
        this.setParamObj(map, prefix + "ParentProcessInfo.", this.ParentProcessInfo);
        this.setParamObj(map, prefix + "AncestorProcessInfo.", this.AncestorProcessInfo);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

