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
package com.tencentcloudapi.cloudaudit.v20190319.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Event extends AbstractModel{

    /**
    * Resource pair
    */
    @SerializedName("Resources")
    @Expose
    private Resource Resources;

    /**
    * Root account ID
    */
    @SerializedName("AccountID")
    @Expose
    private Long AccountID;

    /**
    * Log details
    */
    @SerializedName("CloudAuditEvent")
    @Expose
    private String CloudAuditEvent;

    /**
    * Authentication error code
    */
    @SerializedName("ErrorCode")
    @Expose
    private Long ErrorCode;

    /**
    * Log ID
    */
    @SerializedName("EventId")
    @Expose
    private String EventId;

    /**
    * Event name
    */
    @SerializedName("EventName")
    @Expose
    private String EventName;

    /**
    * Chinese description of event name (please use this field as required; if you are using other languages, ignore this field)
    */
    @SerializedName("EventNameCn")
    @Expose
    private String EventNameCn;

    /**
    * Event region
    */
    @SerializedName("EventRegion")
    @Expose
    private String EventRegion;

    /**
    * Request source
    */
    @SerializedName("EventSource")
    @Expose
    private String EventSource;

    /**
    * Event time
    */
    @SerializedName("EventTime")
    @Expose
    private String EventTime;

    /**
    * Request ID
    */
    @SerializedName("RequestID")
    @Expose
    private String RequestID;

    /**
    * Resource region
    */
    @SerializedName("ResourceRegion")
    @Expose
    private String ResourceRegion;

    /**
    * Chinese description of resource type (please use this field as required; if you are using other languages, ignore this field)
    */
    @SerializedName("ResourceTypeCn")
    @Expose
    private String ResourceTypeCn;

    /**
    * Certificate ID
    */
    @SerializedName("SecretId")
    @Expose
    private String SecretId;

    /**
    * Source IP
    */
    @SerializedName("SourceIPAddress")
    @Expose
    private String SourceIPAddress;

    /**
    * Username
    */
    @SerializedName("Username")
    @Expose
    private String Username;

    /**
     * Get Resource pair 
     * @return Resources Resource pair
     */
    public Resource getResources() {
        return this.Resources;
    }

    /**
     * Set Resource pair
     * @param Resources Resource pair
     */
    public void setResources(Resource Resources) {
        this.Resources = Resources;
    }

    /**
     * Get Root account ID 
     * @return AccountID Root account ID
     */
    public Long getAccountID() {
        return this.AccountID;
    }

    /**
     * Set Root account ID
     * @param AccountID Root account ID
     */
    public void setAccountID(Long AccountID) {
        this.AccountID = AccountID;
    }

    /**
     * Get Log details 
     * @return CloudAuditEvent Log details
     */
    public String getCloudAuditEvent() {
        return this.CloudAuditEvent;
    }

    /**
     * Set Log details
     * @param CloudAuditEvent Log details
     */
    public void setCloudAuditEvent(String CloudAuditEvent) {
        this.CloudAuditEvent = CloudAuditEvent;
    }

    /**
     * Get Authentication error code 
     * @return ErrorCode Authentication error code
     */
    public Long getErrorCode() {
        return this.ErrorCode;
    }

    /**
     * Set Authentication error code
     * @param ErrorCode Authentication error code
     */
    public void setErrorCode(Long ErrorCode) {
        this.ErrorCode = ErrorCode;
    }

    /**
     * Get Log ID 
     * @return EventId Log ID
     */
    public String getEventId() {
        return this.EventId;
    }

    /**
     * Set Log ID
     * @param EventId Log ID
     */
    public void setEventId(String EventId) {
        this.EventId = EventId;
    }

    /**
     * Get Event name 
     * @return EventName Event name
     */
    public String getEventName() {
        return this.EventName;
    }

    /**
     * Set Event name
     * @param EventName Event name
     */
    public void setEventName(String EventName) {
        this.EventName = EventName;
    }

    /**
     * Get Chinese description of event name (please use this field as required; if you are using other languages, ignore this field) 
     * @return EventNameCn Chinese description of event name (please use this field as required; if you are using other languages, ignore this field)
     */
    public String getEventNameCn() {
        return this.EventNameCn;
    }

    /**
     * Set Chinese description of event name (please use this field as required; if you are using other languages, ignore this field)
     * @param EventNameCn Chinese description of event name (please use this field as required; if you are using other languages, ignore this field)
     */
    public void setEventNameCn(String EventNameCn) {
        this.EventNameCn = EventNameCn;
    }

    /**
     * Get Event region 
     * @return EventRegion Event region
     */
    public String getEventRegion() {
        return this.EventRegion;
    }

    /**
     * Set Event region
     * @param EventRegion Event region
     */
    public void setEventRegion(String EventRegion) {
        this.EventRegion = EventRegion;
    }

    /**
     * Get Request source 
     * @return EventSource Request source
     */
    public String getEventSource() {
        return this.EventSource;
    }

    /**
     * Set Request source
     * @param EventSource Request source
     */
    public void setEventSource(String EventSource) {
        this.EventSource = EventSource;
    }

    /**
     * Get Event time 
     * @return EventTime Event time
     */
    public String getEventTime() {
        return this.EventTime;
    }

    /**
     * Set Event time
     * @param EventTime Event time
     */
    public void setEventTime(String EventTime) {
        this.EventTime = EventTime;
    }

    /**
     * Get Request ID 
     * @return RequestID Request ID
     */
    public String getRequestID() {
        return this.RequestID;
    }

    /**
     * Set Request ID
     * @param RequestID Request ID
     */
    public void setRequestID(String RequestID) {
        this.RequestID = RequestID;
    }

    /**
     * Get Resource region 
     * @return ResourceRegion Resource region
     */
    public String getResourceRegion() {
        return this.ResourceRegion;
    }

    /**
     * Set Resource region
     * @param ResourceRegion Resource region
     */
    public void setResourceRegion(String ResourceRegion) {
        this.ResourceRegion = ResourceRegion;
    }

    /**
     * Get Chinese description of resource type (please use this field as required; if you are using other languages, ignore this field) 
     * @return ResourceTypeCn Chinese description of resource type (please use this field as required; if you are using other languages, ignore this field)
     */
    public String getResourceTypeCn() {
        return this.ResourceTypeCn;
    }

    /**
     * Set Chinese description of resource type (please use this field as required; if you are using other languages, ignore this field)
     * @param ResourceTypeCn Chinese description of resource type (please use this field as required; if you are using other languages, ignore this field)
     */
    public void setResourceTypeCn(String ResourceTypeCn) {
        this.ResourceTypeCn = ResourceTypeCn;
    }

    /**
     * Get Certificate ID 
     * @return SecretId Certificate ID
     */
    public String getSecretId() {
        return this.SecretId;
    }

    /**
     * Set Certificate ID
     * @param SecretId Certificate ID
     */
    public void setSecretId(String SecretId) {
        this.SecretId = SecretId;
    }

    /**
     * Get Source IP 
     * @return SourceIPAddress Source IP
     */
    public String getSourceIPAddress() {
        return this.SourceIPAddress;
    }

    /**
     * Set Source IP
     * @param SourceIPAddress Source IP
     */
    public void setSourceIPAddress(String SourceIPAddress) {
        this.SourceIPAddress = SourceIPAddress;
    }

    /**
     * Get Username 
     * @return Username Username
     */
    public String getUsername() {
        return this.Username;
    }

    /**
     * Set Username
     * @param Username Username
     */
    public void setUsername(String Username) {
        this.Username = Username;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Resources.", this.Resources);
        this.setParamSimple(map, prefix + "AccountID", this.AccountID);
        this.setParamSimple(map, prefix + "CloudAuditEvent", this.CloudAuditEvent);
        this.setParamSimple(map, prefix + "ErrorCode", this.ErrorCode);
        this.setParamSimple(map, prefix + "EventId", this.EventId);
        this.setParamSimple(map, prefix + "EventName", this.EventName);
        this.setParamSimple(map, prefix + "EventNameCn", this.EventNameCn);
        this.setParamSimple(map, prefix + "EventRegion", this.EventRegion);
        this.setParamSimple(map, prefix + "EventSource", this.EventSource);
        this.setParamSimple(map, prefix + "EventTime", this.EventTime);
        this.setParamSimple(map, prefix + "RequestID", this.RequestID);
        this.setParamSimple(map, prefix + "ResourceRegion", this.ResourceRegion);
        this.setParamSimple(map, prefix + "ResourceTypeCn", this.ResourceTypeCn);
        this.setParamSimple(map, prefix + "SecretId", this.SecretId);
        this.setParamSimple(map, prefix + "SourceIPAddress", this.SourceIPAddress);
        this.setParamSimple(map, prefix + "Username", this.Username);

    }
}

