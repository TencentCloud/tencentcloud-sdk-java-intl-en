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
package com.tencentcloudapi.cloudaudit.v20190319.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Event extends AbstractModel {

    /**
    * Log ID
    */
    @SerializedName("EventId")
    @Expose
    private String EventId;

    /**
    * Username
    */
    @SerializedName("Username")
    @Expose
    private String Username;

    /**
    * Event Time
    */
    @SerializedName("EventTime")
    @Expose
    private String EventTime;

    /**
    * Log details
    */
    @SerializedName("CloudAuditEvent")
    @Expose
    private String CloudAuditEvent;

    /**
    * Description of resource type in Chinese (please use this field as required; if you are using other languages, ignore this field)
    */
    @SerializedName("ResourceTypeCn")
    @Expose
    private String ResourceTypeCn;

    /**
    * Authentication error code
    */
    @SerializedName("ErrorCode")
    @Expose
    private Long ErrorCode;

    /**
    * Event name
    */
    @SerializedName("EventName")
    @Expose
    private String EventName;

    /**
    * Certificate ID
Note: `null` may be returned for this field, indicating that no valid values can be obtained.
    */
    @SerializedName("SecretId")
    @Expose
    private String SecretId;

    /**
    * Request source
    */
    @SerializedName("EventSource")
    @Expose
    private String EventSource;

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
    * Root account ID
    */
    @SerializedName("AccountID")
    @Expose
    private Long AccountID;

    /**
    * Source IP
Note: `null` may be returned for this field, indicating that no valid values can be obtained.
    */
    @SerializedName("SourceIPAddress")
    @Expose
    private String SourceIPAddress;

    /**
    * Description of event name in Chinese (please use this field as required; if you are using other languages, ignore this field)
    */
    @SerializedName("EventNameCn")
    @Expose
    private String EventNameCn;

    /**
    * Resource pair
    */
    @SerializedName("Resources")
    @Expose
    private Resource Resources;

    /**
    * Event region
    */
    @SerializedName("EventRegion")
    @Expose
    private String EventRegion;

    /**
    * IP location
    */
    @SerializedName("Location")
    @Expose
    private String Location;

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
     * Get Event Time 
     * @return EventTime Event Time
     */
    public String getEventTime() {
        return this.EventTime;
    }

    /**
     * Set Event Time
     * @param EventTime Event Time
     */
    public void setEventTime(String EventTime) {
        this.EventTime = EventTime;
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
     * Get Description of resource type in Chinese (please use this field as required; if you are using other languages, ignore this field) 
     * @return ResourceTypeCn Description of resource type in Chinese (please use this field as required; if you are using other languages, ignore this field)
     */
    public String getResourceTypeCn() {
        return this.ResourceTypeCn;
    }

    /**
     * Set Description of resource type in Chinese (please use this field as required; if you are using other languages, ignore this field)
     * @param ResourceTypeCn Description of resource type in Chinese (please use this field as required; if you are using other languages, ignore this field)
     */
    public void setResourceTypeCn(String ResourceTypeCn) {
        this.ResourceTypeCn = ResourceTypeCn;
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
     * Get Certificate ID
Note: `null` may be returned for this field, indicating that no valid values can be obtained. 
     * @return SecretId Certificate ID
Note: `null` may be returned for this field, indicating that no valid values can be obtained.
     */
    public String getSecretId() {
        return this.SecretId;
    }

    /**
     * Set Certificate ID
Note: `null` may be returned for this field, indicating that no valid values can be obtained.
     * @param SecretId Certificate ID
Note: `null` may be returned for this field, indicating that no valid values can be obtained.
     */
    public void setSecretId(String SecretId) {
        this.SecretId = SecretId;
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
     * Get Source IP
Note: `null` may be returned for this field, indicating that no valid values can be obtained. 
     * @return SourceIPAddress Source IP
Note: `null` may be returned for this field, indicating that no valid values can be obtained.
     */
    public String getSourceIPAddress() {
        return this.SourceIPAddress;
    }

    /**
     * Set Source IP
Note: `null` may be returned for this field, indicating that no valid values can be obtained.
     * @param SourceIPAddress Source IP
Note: `null` may be returned for this field, indicating that no valid values can be obtained.
     */
    public void setSourceIPAddress(String SourceIPAddress) {
        this.SourceIPAddress = SourceIPAddress;
    }

    /**
     * Get Description of event name in Chinese (please use this field as required; if you are using other languages, ignore this field) 
     * @return EventNameCn Description of event name in Chinese (please use this field as required; if you are using other languages, ignore this field)
     */
    public String getEventNameCn() {
        return this.EventNameCn;
    }

    /**
     * Set Description of event name in Chinese (please use this field as required; if you are using other languages, ignore this field)
     * @param EventNameCn Description of event name in Chinese (please use this field as required; if you are using other languages, ignore this field)
     */
    public void setEventNameCn(String EventNameCn) {
        this.EventNameCn = EventNameCn;
    }

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
     * Get IP location 
     * @return Location IP location
     */
    public String getLocation() {
        return this.Location;
    }

    /**
     * Set IP location
     * @param Location IP location
     */
    public void setLocation(String Location) {
        this.Location = Location;
    }

    public Event() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Event(Event source) {
        if (source.EventId != null) {
            this.EventId = new String(source.EventId);
        }
        if (source.Username != null) {
            this.Username = new String(source.Username);
        }
        if (source.EventTime != null) {
            this.EventTime = new String(source.EventTime);
        }
        if (source.CloudAuditEvent != null) {
            this.CloudAuditEvent = new String(source.CloudAuditEvent);
        }
        if (source.ResourceTypeCn != null) {
            this.ResourceTypeCn = new String(source.ResourceTypeCn);
        }
        if (source.ErrorCode != null) {
            this.ErrorCode = new Long(source.ErrorCode);
        }
        if (source.EventName != null) {
            this.EventName = new String(source.EventName);
        }
        if (source.SecretId != null) {
            this.SecretId = new String(source.SecretId);
        }
        if (source.EventSource != null) {
            this.EventSource = new String(source.EventSource);
        }
        if (source.RequestID != null) {
            this.RequestID = new String(source.RequestID);
        }
        if (source.ResourceRegion != null) {
            this.ResourceRegion = new String(source.ResourceRegion);
        }
        if (source.AccountID != null) {
            this.AccountID = new Long(source.AccountID);
        }
        if (source.SourceIPAddress != null) {
            this.SourceIPAddress = new String(source.SourceIPAddress);
        }
        if (source.EventNameCn != null) {
            this.EventNameCn = new String(source.EventNameCn);
        }
        if (source.Resources != null) {
            this.Resources = new Resource(source.Resources);
        }
        if (source.EventRegion != null) {
            this.EventRegion = new String(source.EventRegion);
        }
        if (source.Location != null) {
            this.Location = new String(source.Location);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EventId", this.EventId);
        this.setParamSimple(map, prefix + "Username", this.Username);
        this.setParamSimple(map, prefix + "EventTime", this.EventTime);
        this.setParamSimple(map, prefix + "CloudAuditEvent", this.CloudAuditEvent);
        this.setParamSimple(map, prefix + "ResourceTypeCn", this.ResourceTypeCn);
        this.setParamSimple(map, prefix + "ErrorCode", this.ErrorCode);
        this.setParamSimple(map, prefix + "EventName", this.EventName);
        this.setParamSimple(map, prefix + "SecretId", this.SecretId);
        this.setParamSimple(map, prefix + "EventSource", this.EventSource);
        this.setParamSimple(map, prefix + "RequestID", this.RequestID);
        this.setParamSimple(map, prefix + "ResourceRegion", this.ResourceRegion);
        this.setParamSimple(map, prefix + "AccountID", this.AccountID);
        this.setParamSimple(map, prefix + "SourceIPAddress", this.SourceIPAddress);
        this.setParamSimple(map, prefix + "EventNameCn", this.EventNameCn);
        this.setParamObj(map, prefix + "Resources.", this.Resources);
        this.setParamSimple(map, prefix + "EventRegion", this.EventRegion);
        this.setParamSimple(map, prefix + "Location", this.Location);

    }
}

