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
package com.tencentcloudapi.ciam.v20220331.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Job extends AbstractModel {

    /**
    * Task ID
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * Task status

<li> **PENDING** </li>  Pending
<li> **PROCESSING** </li>  Executing
<li> **COMPLETED** </li>  Completed
<li> **FAILED** </li>  Failed
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * Task type

<li> **IMPORT_USER** </li>  User import
<li> **EXPORT_USER** </li>  User export
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * Task creation time
    */
    @SerializedName("CreatedDate")
    @Expose
    private Long CreatedDate;

    /**
    * Data type of the task

<li> **NDJSON** </li>  New-line Delimited JSON
<li> **CSV** </li>  Comma-Separated Values
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Format")
    @Expose
    private String Format;

    /**
    * Task result download address
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Location")
    @Expose
    private String Location;

    /**
    * Failure details
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ErrorDetails")
    @Expose
    private ErrorDetails [] ErrorDetails;

    /**
    * Failed user
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("FailedUsers")
    @Expose
    private FailedUsers [] FailedUsers;

    /**
     * Get Task ID 
     * @return Id Task ID
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set Task ID
     * @param Id Task ID
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * Get Task status

<li> **PENDING** </li>  Pending
<li> **PROCESSING** </li>  Executing
<li> **COMPLETED** </li>  Completed
<li> **FAILED** </li>  Failed 
     * @return Status Task status

<li> **PENDING** </li>  Pending
<li> **PROCESSING** </li>  Executing
<li> **COMPLETED** </li>  Completed
<li> **FAILED** </li>  Failed
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set Task status

<li> **PENDING** </li>  Pending
<li> **PROCESSING** </li>  Executing
<li> **COMPLETED** </li>  Completed
<li> **FAILED** </li>  Failed
     * @param Status Task status

<li> **PENDING** </li>  Pending
<li> **PROCESSING** </li>  Executing
<li> **COMPLETED** </li>  Completed
<li> **FAILED** </li>  Failed
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get Task type

<li> **IMPORT_USER** </li>  User import
<li> **EXPORT_USER** </li>  User export 
     * @return Type Task type

<li> **IMPORT_USER** </li>  User import
<li> **EXPORT_USER** </li>  User export
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set Task type

<li> **IMPORT_USER** </li>  User import
<li> **EXPORT_USER** </li>  User export
     * @param Type Task type

<li> **IMPORT_USER** </li>  User import
<li> **EXPORT_USER** </li>  User export
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get Task creation time 
     * @return CreatedDate Task creation time
     */
    public Long getCreatedDate() {
        return this.CreatedDate;
    }

    /**
     * Set Task creation time
     * @param CreatedDate Task creation time
     */
    public void setCreatedDate(Long CreatedDate) {
        this.CreatedDate = CreatedDate;
    }

    /**
     * Get Data type of the task

<li> **NDJSON** </li>  New-line Delimited JSON
<li> **CSV** </li>  Comma-Separated Values
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return Format Data type of the task

<li> **NDJSON** </li>  New-line Delimited JSON
<li> **CSV** </li>  Comma-Separated Values
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getFormat() {
        return this.Format;
    }

    /**
     * Set Data type of the task

<li> **NDJSON** </li>  New-line Delimited JSON
<li> **CSV** </li>  Comma-Separated Values
Note: this field may return null, indicating that no valid values can be obtained.
     * @param Format Data type of the task

<li> **NDJSON** </li>  New-line Delimited JSON
<li> **CSV** </li>  Comma-Separated Values
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setFormat(String Format) {
        this.Format = Format;
    }

    /**
     * Get Task result download address
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Location Task result download address
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getLocation() {
        return this.Location;
    }

    /**
     * Set Task result download address
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Location Task result download address
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setLocation(String Location) {
        this.Location = Location;
    }

    /**
     * Get Failure details
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ErrorDetails Failure details
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public ErrorDetails [] getErrorDetails() {
        return this.ErrorDetails;
    }

    /**
     * Set Failure details
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ErrorDetails Failure details
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setErrorDetails(ErrorDetails [] ErrorDetails) {
        this.ErrorDetails = ErrorDetails;
    }

    /**
     * Get Failed user
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return FailedUsers Failed user
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public FailedUsers [] getFailedUsers() {
        return this.FailedUsers;
    }

    /**
     * Set Failed user
Note: This field may return null, indicating that no valid values can be obtained.
     * @param FailedUsers Failed user
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setFailedUsers(FailedUsers [] FailedUsers) {
        this.FailedUsers = FailedUsers;
    }

    public Job() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Job(Job source) {
        if (source.Id != null) {
            this.Id = new String(source.Id);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.CreatedDate != null) {
            this.CreatedDate = new Long(source.CreatedDate);
        }
        if (source.Format != null) {
            this.Format = new String(source.Format);
        }
        if (source.Location != null) {
            this.Location = new String(source.Location);
        }
        if (source.ErrorDetails != null) {
            this.ErrorDetails = new ErrorDetails[source.ErrorDetails.length];
            for (int i = 0; i < source.ErrorDetails.length; i++) {
                this.ErrorDetails[i] = new ErrorDetails(source.ErrorDetails[i]);
            }
        }
        if (source.FailedUsers != null) {
            this.FailedUsers = new FailedUsers[source.FailedUsers.length];
            for (int i = 0; i < source.FailedUsers.length; i++) {
                this.FailedUsers[i] = new FailedUsers(source.FailedUsers[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "CreatedDate", this.CreatedDate);
        this.setParamSimple(map, prefix + "Format", this.Format);
        this.setParamSimple(map, prefix + "Location", this.Location);
        this.setParamArrayObj(map, prefix + "ErrorDetails.", this.ErrorDetails);
        this.setParamArrayObj(map, prefix + "FailedUsers.", this.FailedUsers);

    }
}

