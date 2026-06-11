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
package com.tencentcloudapi.cls.v20201016.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyShipperRequest extends AbstractModel {

    /**
    * <p>Shipping rule ID.</p><ul><li>Obtain the ShipperId by <a href="https://www.tencentcloud.com/document/product/614/58745?from_cn_redirect=1">obtaining the shipping task list</a>.</li></ul>
    */
    @SerializedName("ShipperId")
    @Expose
    private String ShipperId;

    /**
    * <p>COS bucket, see the supported <a href="https://www.tencentcloud.com/document/product/436/13312?from_cn_redirect=1">bucket naming conventions</a>.</p><ul><li>Obtain COS buckets via <a href="https://www.tencentcloud.com/document/product/436/8291?from_cn_redirect=1">GET Service (List Buckets)</a>.</li></ul>
    */
    @SerializedName("Bucket")
    @Expose
    private String Bucket;

    /**
    * <p>The new directory prefix delivered by the Shipping Rule.</p><ul><li>Only 0-9A-Za-z-_/ are allowed.</li><li>Supports a maximum of 256 characters.</li></ul>
    */
    @SerializedName("Prefix")
    @Expose
    private String Prefix;

    /**
    * <p>Switch state of shipping rules. true: enable delivery task; false: disable delivery task.</p>
    */
    @SerializedName("Status")
    @Expose
    private Boolean Status;

    /**
    * <p>Shipping rule name</p>
    */
    @SerializedName("ShipperName")
    @Expose
    private String ShipperName;

    /**
    * <p>Shipping time interval in seconds. Default: 300. Valid range: 300-900.</p>
    */
    @SerializedName("Interval")
    @Expose
    private Long Interval;

    /**
    * <p>Maximum value of delivered files in MB. Default: 256. Range: 5-256.</p>
    */
    @SerializedName("MaxSize")
    @Expose
    private Long MaxSize;

    /**
    * <p>Filter rules for log shipping. Matched logs are shipped. The relationship between the rules is and. Up to 5 rules are allowed. An empty array indicates all logs are shipped without filtering.</p>
    */
    @SerializedName("FilterRules")
    @Expose
    private FilterRuleInfo [] FilterRules;

    /**
    * <p>Partition rules for log shipping support strftime time format representation</p>
    */
    @SerializedName("Partition")
    @Expose
    private String Partition;

    /**
    * <p>Compression configuration of shipped logs</p>
    */
    @SerializedName("Compress")
    @Expose
    private CompressInfo Compress;

    /**
    * <p>Content format configuration for shipped logs</p>
    */
    @SerializedName("Content")
    @Expose
    private ContentInfo Content;

    /**
    * <p>Delivery file naming configuration. 0: Random number naming. 1: Delivery time naming.</p>
    */
    @SerializedName("FilenameMode")
    @Expose
    private Long FilenameMode;

    /**
    * <p>The storage type. Default value is STANDARD. For enumeration values, please refer to the <a href="https://www.tencentcloud.com/document/product/436/33417?from_cn_redirect=1">storage class overview</a> document.<br>Reference values include:</p><ul><li>STANDARD: standard storage</li><li>STANDARD_IA: infrequent storage</li><li>ARCHIVE: archive storage</li><li>DEEP_ARCHIVE: deep archive storage</li><li>MAZ_STANDARD: standard storage (multi-AZ)</li><li>MAZ_STANDARD_IA: infrequent storage (multi-AZ)</li><li>INTELLIGENT_TIERING: intelligent tiering storage</li><li>MAZ_INTELLIGENT_TIERING: intelligent tiering storage (multi-AZ)</li></ul>
    */
    @SerializedName("StorageType")
    @Expose
    private String StorageType;

    /**
    * <p>Role access description name <a href="https://www.tencentcloud.com/document/product/598/19381?from_cn_redirect=1">Create role</a></p>
    */
    @SerializedName("RoleArn")
    @Expose
    private String RoleArn;

    /**
    * <p>External ID</p>
    */
    @SerializedName("ExternalId")
    @Expose
    private String ExternalId;

    /**
    * <p>Used to generate time variables in the file path shipped to COS.</p><p>Input limitation: Supports the following time zone list</p><ul><li>GMT-12:00</li><li>GMT-11:00</li><li>GMT-10:00</li><li>GMT-09:30</li><li>GMT-09:00</li><li>GMT-08:00</li><li>GMT-07:00</li><li>GMT-06:00</li><li>GMT-05:00</li><li>GMT-04:00</li><li>GMT-03:30</li><li>GMT-03:00</li><li>GMT-02:00</li><li>GMT-01:00</li><li>GMT+00:00</li><li>GMT+01:00</li><li>GMT+02:00</li><li>GMT+03:30</li><li>GMT+04:00</li><li>GMT+04:30</li><li>GMT+05:00</li><li>GMT+05:30</li><li>GMT+05:45</li><li>GMT+06:00</li><li>GMT+06:30</li><li>GMT+07:00</li><li>GMT+08:00</li><li>GMT+09:00</li><li>GMT+09:30</li><li>GMT+10:00</li><li>GMT+10:30</li><li>GMT+11:00</li><li>GMT+11:30</li><li>GMT+12:00</li><li>GMT+12:45</li><li>GMT+13:00</li><li>GMT+14:00</li><li>UTC-11:00</li><li>UTC-10:00</li><li>UTC-09:00</li><li>UTC-08:00</li><li>UTC-12:00</li><li>UTC-07:00</li><li>UTC-06:00</li><li>UTC-05:00</li><li>UTC-04:30</li><li>UTC-04:00</li><li>UTC-03:30</li><li>UTC-03:00</li><li>UTC-02:00</li><li>UTC-01:00</li><li>UTC+00:00</li><li>UTC+01:00</li><li>UTC+02:00</li><li>UTC+03:00</li><li>UTC+03:30</li><li>UTC+04:00</li><li>UTC+04:30</li><li>UTC+05:00</li><li>UTC+05:45</li><li>UTC+06:00</li><li>UTC+06:30</li><li>UTC+07:00</li><li>UTC+08:00</li><li>UTC+09:00</li><li>UTC+09:30</li><li>UTC+10:00</li><li>UTC+11:00</li><li>UTC+12:00</li><li>UTC+13:00</li></ul>
    */
    @SerializedName("TimeZone")
    @Expose
    private String TimeZone;

    /**
    * <p>Pre-filtering process - filter out original data written to COS</p>
    */
    @SerializedName("DSLFilter")
    @Expose
    private String DSLFilter;

    /**
     * Get <p>Shipping rule ID.</p><ul><li>Obtain the ShipperId by <a href="https://www.tencentcloud.com/document/product/614/58745?from_cn_redirect=1">obtaining the shipping task list</a>.</li></ul> 
     * @return ShipperId <p>Shipping rule ID.</p><ul><li>Obtain the ShipperId by <a href="https://www.tencentcloud.com/document/product/614/58745?from_cn_redirect=1">obtaining the shipping task list</a>.</li></ul>
     */
    public String getShipperId() {
        return this.ShipperId;
    }

    /**
     * Set <p>Shipping rule ID.</p><ul><li>Obtain the ShipperId by <a href="https://www.tencentcloud.com/document/product/614/58745?from_cn_redirect=1">obtaining the shipping task list</a>.</li></ul>
     * @param ShipperId <p>Shipping rule ID.</p><ul><li>Obtain the ShipperId by <a href="https://www.tencentcloud.com/document/product/614/58745?from_cn_redirect=1">obtaining the shipping task list</a>.</li></ul>
     */
    public void setShipperId(String ShipperId) {
        this.ShipperId = ShipperId;
    }

    /**
     * Get <p>COS bucket, see the supported <a href="https://www.tencentcloud.com/document/product/436/13312?from_cn_redirect=1">bucket naming conventions</a>.</p><ul><li>Obtain COS buckets via <a href="https://www.tencentcloud.com/document/product/436/8291?from_cn_redirect=1">GET Service (List Buckets)</a>.</li></ul> 
     * @return Bucket <p>COS bucket, see the supported <a href="https://www.tencentcloud.com/document/product/436/13312?from_cn_redirect=1">bucket naming conventions</a>.</p><ul><li>Obtain COS buckets via <a href="https://www.tencentcloud.com/document/product/436/8291?from_cn_redirect=1">GET Service (List Buckets)</a>.</li></ul>
     */
    public String getBucket() {
        return this.Bucket;
    }

    /**
     * Set <p>COS bucket, see the supported <a href="https://www.tencentcloud.com/document/product/436/13312?from_cn_redirect=1">bucket naming conventions</a>.</p><ul><li>Obtain COS buckets via <a href="https://www.tencentcloud.com/document/product/436/8291?from_cn_redirect=1">GET Service (List Buckets)</a>.</li></ul>
     * @param Bucket <p>COS bucket, see the supported <a href="https://www.tencentcloud.com/document/product/436/13312?from_cn_redirect=1">bucket naming conventions</a>.</p><ul><li>Obtain COS buckets via <a href="https://www.tencentcloud.com/document/product/436/8291?from_cn_redirect=1">GET Service (List Buckets)</a>.</li></ul>
     */
    public void setBucket(String Bucket) {
        this.Bucket = Bucket;
    }

    /**
     * Get <p>The new directory prefix delivered by the Shipping Rule.</p><ul><li>Only 0-9A-Za-z-_/ are allowed.</li><li>Supports a maximum of 256 characters.</li></ul> 
     * @return Prefix <p>The new directory prefix delivered by the Shipping Rule.</p><ul><li>Only 0-9A-Za-z-_/ are allowed.</li><li>Supports a maximum of 256 characters.</li></ul>
     */
    public String getPrefix() {
        return this.Prefix;
    }

    /**
     * Set <p>The new directory prefix delivered by the Shipping Rule.</p><ul><li>Only 0-9A-Za-z-_/ are allowed.</li><li>Supports a maximum of 256 characters.</li></ul>
     * @param Prefix <p>The new directory prefix delivered by the Shipping Rule.</p><ul><li>Only 0-9A-Za-z-_/ are allowed.</li><li>Supports a maximum of 256 characters.</li></ul>
     */
    public void setPrefix(String Prefix) {
        this.Prefix = Prefix;
    }

    /**
     * Get <p>Switch state of shipping rules. true: enable delivery task; false: disable delivery task.</p> 
     * @return Status <p>Switch state of shipping rules. true: enable delivery task; false: disable delivery task.</p>
     */
    public Boolean getStatus() {
        return this.Status;
    }

    /**
     * Set <p>Switch state of shipping rules. true: enable delivery task; false: disable delivery task.</p>
     * @param Status <p>Switch state of shipping rules. true: enable delivery task; false: disable delivery task.</p>
     */
    public void setStatus(Boolean Status) {
        this.Status = Status;
    }

    /**
     * Get <p>Shipping rule name</p> 
     * @return ShipperName <p>Shipping rule name</p>
     */
    public String getShipperName() {
        return this.ShipperName;
    }

    /**
     * Set <p>Shipping rule name</p>
     * @param ShipperName <p>Shipping rule name</p>
     */
    public void setShipperName(String ShipperName) {
        this.ShipperName = ShipperName;
    }

    /**
     * Get <p>Shipping time interval in seconds. Default: 300. Valid range: 300-900.</p> 
     * @return Interval <p>Shipping time interval in seconds. Default: 300. Valid range: 300-900.</p>
     */
    public Long getInterval() {
        return this.Interval;
    }

    /**
     * Set <p>Shipping time interval in seconds. Default: 300. Valid range: 300-900.</p>
     * @param Interval <p>Shipping time interval in seconds. Default: 300. Valid range: 300-900.</p>
     */
    public void setInterval(Long Interval) {
        this.Interval = Interval;
    }

    /**
     * Get <p>Maximum value of delivered files in MB. Default: 256. Range: 5-256.</p> 
     * @return MaxSize <p>Maximum value of delivered files in MB. Default: 256. Range: 5-256.</p>
     */
    public Long getMaxSize() {
        return this.MaxSize;
    }

    /**
     * Set <p>Maximum value of delivered files in MB. Default: 256. Range: 5-256.</p>
     * @param MaxSize <p>Maximum value of delivered files in MB. Default: 256. Range: 5-256.</p>
     */
    public void setMaxSize(Long MaxSize) {
        this.MaxSize = MaxSize;
    }

    /**
     * Get <p>Filter rules for log shipping. Matched logs are shipped. The relationship between the rules is and. Up to 5 rules are allowed. An empty array indicates all logs are shipped without filtering.</p> 
     * @return FilterRules <p>Filter rules for log shipping. Matched logs are shipped. The relationship between the rules is and. Up to 5 rules are allowed. An empty array indicates all logs are shipped without filtering.</p>
     */
    public FilterRuleInfo [] getFilterRules() {
        return this.FilterRules;
    }

    /**
     * Set <p>Filter rules for log shipping. Matched logs are shipped. The relationship between the rules is and. Up to 5 rules are allowed. An empty array indicates all logs are shipped without filtering.</p>
     * @param FilterRules <p>Filter rules for log shipping. Matched logs are shipped. The relationship between the rules is and. Up to 5 rules are allowed. An empty array indicates all logs are shipped without filtering.</p>
     */
    public void setFilterRules(FilterRuleInfo [] FilterRules) {
        this.FilterRules = FilterRules;
    }

    /**
     * Get <p>Partition rules for log shipping support strftime time format representation</p> 
     * @return Partition <p>Partition rules for log shipping support strftime time format representation</p>
     */
    public String getPartition() {
        return this.Partition;
    }

    /**
     * Set <p>Partition rules for log shipping support strftime time format representation</p>
     * @param Partition <p>Partition rules for log shipping support strftime time format representation</p>
     */
    public void setPartition(String Partition) {
        this.Partition = Partition;
    }

    /**
     * Get <p>Compression configuration of shipped logs</p> 
     * @return Compress <p>Compression configuration of shipped logs</p>
     */
    public CompressInfo getCompress() {
        return this.Compress;
    }

    /**
     * Set <p>Compression configuration of shipped logs</p>
     * @param Compress <p>Compression configuration of shipped logs</p>
     */
    public void setCompress(CompressInfo Compress) {
        this.Compress = Compress;
    }

    /**
     * Get <p>Content format configuration for shipped logs</p> 
     * @return Content <p>Content format configuration for shipped logs</p>
     */
    public ContentInfo getContent() {
        return this.Content;
    }

    /**
     * Set <p>Content format configuration for shipped logs</p>
     * @param Content <p>Content format configuration for shipped logs</p>
     */
    public void setContent(ContentInfo Content) {
        this.Content = Content;
    }

    /**
     * Get <p>Delivery file naming configuration. 0: Random number naming. 1: Delivery time naming.</p> 
     * @return FilenameMode <p>Delivery file naming configuration. 0: Random number naming. 1: Delivery time naming.</p>
     */
    public Long getFilenameMode() {
        return this.FilenameMode;
    }

    /**
     * Set <p>Delivery file naming configuration. 0: Random number naming. 1: Delivery time naming.</p>
     * @param FilenameMode <p>Delivery file naming configuration. 0: Random number naming. 1: Delivery time naming.</p>
     */
    public void setFilenameMode(Long FilenameMode) {
        this.FilenameMode = FilenameMode;
    }

    /**
     * Get <p>The storage type. Default value is STANDARD. For enumeration values, please refer to the <a href="https://www.tencentcloud.com/document/product/436/33417?from_cn_redirect=1">storage class overview</a> document.<br>Reference values include:</p><ul><li>STANDARD: standard storage</li><li>STANDARD_IA: infrequent storage</li><li>ARCHIVE: archive storage</li><li>DEEP_ARCHIVE: deep archive storage</li><li>MAZ_STANDARD: standard storage (multi-AZ)</li><li>MAZ_STANDARD_IA: infrequent storage (multi-AZ)</li><li>INTELLIGENT_TIERING: intelligent tiering storage</li><li>MAZ_INTELLIGENT_TIERING: intelligent tiering storage (multi-AZ)</li></ul> 
     * @return StorageType <p>The storage type. Default value is STANDARD. For enumeration values, please refer to the <a href="https://www.tencentcloud.com/document/product/436/33417?from_cn_redirect=1">storage class overview</a> document.<br>Reference values include:</p><ul><li>STANDARD: standard storage</li><li>STANDARD_IA: infrequent storage</li><li>ARCHIVE: archive storage</li><li>DEEP_ARCHIVE: deep archive storage</li><li>MAZ_STANDARD: standard storage (multi-AZ)</li><li>MAZ_STANDARD_IA: infrequent storage (multi-AZ)</li><li>INTELLIGENT_TIERING: intelligent tiering storage</li><li>MAZ_INTELLIGENT_TIERING: intelligent tiering storage (multi-AZ)</li></ul>
     */
    public String getStorageType() {
        return this.StorageType;
    }

    /**
     * Set <p>The storage type. Default value is STANDARD. For enumeration values, please refer to the <a href="https://www.tencentcloud.com/document/product/436/33417?from_cn_redirect=1">storage class overview</a> document.<br>Reference values include:</p><ul><li>STANDARD: standard storage</li><li>STANDARD_IA: infrequent storage</li><li>ARCHIVE: archive storage</li><li>DEEP_ARCHIVE: deep archive storage</li><li>MAZ_STANDARD: standard storage (multi-AZ)</li><li>MAZ_STANDARD_IA: infrequent storage (multi-AZ)</li><li>INTELLIGENT_TIERING: intelligent tiering storage</li><li>MAZ_INTELLIGENT_TIERING: intelligent tiering storage (multi-AZ)</li></ul>
     * @param StorageType <p>The storage type. Default value is STANDARD. For enumeration values, please refer to the <a href="https://www.tencentcloud.com/document/product/436/33417?from_cn_redirect=1">storage class overview</a> document.<br>Reference values include:</p><ul><li>STANDARD: standard storage</li><li>STANDARD_IA: infrequent storage</li><li>ARCHIVE: archive storage</li><li>DEEP_ARCHIVE: deep archive storage</li><li>MAZ_STANDARD: standard storage (multi-AZ)</li><li>MAZ_STANDARD_IA: infrequent storage (multi-AZ)</li><li>INTELLIGENT_TIERING: intelligent tiering storage</li><li>MAZ_INTELLIGENT_TIERING: intelligent tiering storage (multi-AZ)</li></ul>
     */
    public void setStorageType(String StorageType) {
        this.StorageType = StorageType;
    }

    /**
     * Get <p>Role access description name <a href="https://www.tencentcloud.com/document/product/598/19381?from_cn_redirect=1">Create role</a></p> 
     * @return RoleArn <p>Role access description name <a href="https://www.tencentcloud.com/document/product/598/19381?from_cn_redirect=1">Create role</a></p>
     */
    public String getRoleArn() {
        return this.RoleArn;
    }

    /**
     * Set <p>Role access description name <a href="https://www.tencentcloud.com/document/product/598/19381?from_cn_redirect=1">Create role</a></p>
     * @param RoleArn <p>Role access description name <a href="https://www.tencentcloud.com/document/product/598/19381?from_cn_redirect=1">Create role</a></p>
     */
    public void setRoleArn(String RoleArn) {
        this.RoleArn = RoleArn;
    }

    /**
     * Get <p>External ID</p> 
     * @return ExternalId <p>External ID</p>
     */
    public String getExternalId() {
        return this.ExternalId;
    }

    /**
     * Set <p>External ID</p>
     * @param ExternalId <p>External ID</p>
     */
    public void setExternalId(String ExternalId) {
        this.ExternalId = ExternalId;
    }

    /**
     * Get <p>Used to generate time variables in the file path shipped to COS.</p><p>Input limitation: Supports the following time zone list</p><ul><li>GMT-12:00</li><li>GMT-11:00</li><li>GMT-10:00</li><li>GMT-09:30</li><li>GMT-09:00</li><li>GMT-08:00</li><li>GMT-07:00</li><li>GMT-06:00</li><li>GMT-05:00</li><li>GMT-04:00</li><li>GMT-03:30</li><li>GMT-03:00</li><li>GMT-02:00</li><li>GMT-01:00</li><li>GMT+00:00</li><li>GMT+01:00</li><li>GMT+02:00</li><li>GMT+03:30</li><li>GMT+04:00</li><li>GMT+04:30</li><li>GMT+05:00</li><li>GMT+05:30</li><li>GMT+05:45</li><li>GMT+06:00</li><li>GMT+06:30</li><li>GMT+07:00</li><li>GMT+08:00</li><li>GMT+09:00</li><li>GMT+09:30</li><li>GMT+10:00</li><li>GMT+10:30</li><li>GMT+11:00</li><li>GMT+11:30</li><li>GMT+12:00</li><li>GMT+12:45</li><li>GMT+13:00</li><li>GMT+14:00</li><li>UTC-11:00</li><li>UTC-10:00</li><li>UTC-09:00</li><li>UTC-08:00</li><li>UTC-12:00</li><li>UTC-07:00</li><li>UTC-06:00</li><li>UTC-05:00</li><li>UTC-04:30</li><li>UTC-04:00</li><li>UTC-03:30</li><li>UTC-03:00</li><li>UTC-02:00</li><li>UTC-01:00</li><li>UTC+00:00</li><li>UTC+01:00</li><li>UTC+02:00</li><li>UTC+03:00</li><li>UTC+03:30</li><li>UTC+04:00</li><li>UTC+04:30</li><li>UTC+05:00</li><li>UTC+05:45</li><li>UTC+06:00</li><li>UTC+06:30</li><li>UTC+07:00</li><li>UTC+08:00</li><li>UTC+09:00</li><li>UTC+09:30</li><li>UTC+10:00</li><li>UTC+11:00</li><li>UTC+12:00</li><li>UTC+13:00</li></ul> 
     * @return TimeZone <p>Used to generate time variables in the file path shipped to COS.</p><p>Input limitation: Supports the following time zone list</p><ul><li>GMT-12:00</li><li>GMT-11:00</li><li>GMT-10:00</li><li>GMT-09:30</li><li>GMT-09:00</li><li>GMT-08:00</li><li>GMT-07:00</li><li>GMT-06:00</li><li>GMT-05:00</li><li>GMT-04:00</li><li>GMT-03:30</li><li>GMT-03:00</li><li>GMT-02:00</li><li>GMT-01:00</li><li>GMT+00:00</li><li>GMT+01:00</li><li>GMT+02:00</li><li>GMT+03:30</li><li>GMT+04:00</li><li>GMT+04:30</li><li>GMT+05:00</li><li>GMT+05:30</li><li>GMT+05:45</li><li>GMT+06:00</li><li>GMT+06:30</li><li>GMT+07:00</li><li>GMT+08:00</li><li>GMT+09:00</li><li>GMT+09:30</li><li>GMT+10:00</li><li>GMT+10:30</li><li>GMT+11:00</li><li>GMT+11:30</li><li>GMT+12:00</li><li>GMT+12:45</li><li>GMT+13:00</li><li>GMT+14:00</li><li>UTC-11:00</li><li>UTC-10:00</li><li>UTC-09:00</li><li>UTC-08:00</li><li>UTC-12:00</li><li>UTC-07:00</li><li>UTC-06:00</li><li>UTC-05:00</li><li>UTC-04:30</li><li>UTC-04:00</li><li>UTC-03:30</li><li>UTC-03:00</li><li>UTC-02:00</li><li>UTC-01:00</li><li>UTC+00:00</li><li>UTC+01:00</li><li>UTC+02:00</li><li>UTC+03:00</li><li>UTC+03:30</li><li>UTC+04:00</li><li>UTC+04:30</li><li>UTC+05:00</li><li>UTC+05:45</li><li>UTC+06:00</li><li>UTC+06:30</li><li>UTC+07:00</li><li>UTC+08:00</li><li>UTC+09:00</li><li>UTC+09:30</li><li>UTC+10:00</li><li>UTC+11:00</li><li>UTC+12:00</li><li>UTC+13:00</li></ul>
     */
    public String getTimeZone() {
        return this.TimeZone;
    }

    /**
     * Set <p>Used to generate time variables in the file path shipped to COS.</p><p>Input limitation: Supports the following time zone list</p><ul><li>GMT-12:00</li><li>GMT-11:00</li><li>GMT-10:00</li><li>GMT-09:30</li><li>GMT-09:00</li><li>GMT-08:00</li><li>GMT-07:00</li><li>GMT-06:00</li><li>GMT-05:00</li><li>GMT-04:00</li><li>GMT-03:30</li><li>GMT-03:00</li><li>GMT-02:00</li><li>GMT-01:00</li><li>GMT+00:00</li><li>GMT+01:00</li><li>GMT+02:00</li><li>GMT+03:30</li><li>GMT+04:00</li><li>GMT+04:30</li><li>GMT+05:00</li><li>GMT+05:30</li><li>GMT+05:45</li><li>GMT+06:00</li><li>GMT+06:30</li><li>GMT+07:00</li><li>GMT+08:00</li><li>GMT+09:00</li><li>GMT+09:30</li><li>GMT+10:00</li><li>GMT+10:30</li><li>GMT+11:00</li><li>GMT+11:30</li><li>GMT+12:00</li><li>GMT+12:45</li><li>GMT+13:00</li><li>GMT+14:00</li><li>UTC-11:00</li><li>UTC-10:00</li><li>UTC-09:00</li><li>UTC-08:00</li><li>UTC-12:00</li><li>UTC-07:00</li><li>UTC-06:00</li><li>UTC-05:00</li><li>UTC-04:30</li><li>UTC-04:00</li><li>UTC-03:30</li><li>UTC-03:00</li><li>UTC-02:00</li><li>UTC-01:00</li><li>UTC+00:00</li><li>UTC+01:00</li><li>UTC+02:00</li><li>UTC+03:00</li><li>UTC+03:30</li><li>UTC+04:00</li><li>UTC+04:30</li><li>UTC+05:00</li><li>UTC+05:45</li><li>UTC+06:00</li><li>UTC+06:30</li><li>UTC+07:00</li><li>UTC+08:00</li><li>UTC+09:00</li><li>UTC+09:30</li><li>UTC+10:00</li><li>UTC+11:00</li><li>UTC+12:00</li><li>UTC+13:00</li></ul>
     * @param TimeZone <p>Used to generate time variables in the file path shipped to COS.</p><p>Input limitation: Supports the following time zone list</p><ul><li>GMT-12:00</li><li>GMT-11:00</li><li>GMT-10:00</li><li>GMT-09:30</li><li>GMT-09:00</li><li>GMT-08:00</li><li>GMT-07:00</li><li>GMT-06:00</li><li>GMT-05:00</li><li>GMT-04:00</li><li>GMT-03:30</li><li>GMT-03:00</li><li>GMT-02:00</li><li>GMT-01:00</li><li>GMT+00:00</li><li>GMT+01:00</li><li>GMT+02:00</li><li>GMT+03:30</li><li>GMT+04:00</li><li>GMT+04:30</li><li>GMT+05:00</li><li>GMT+05:30</li><li>GMT+05:45</li><li>GMT+06:00</li><li>GMT+06:30</li><li>GMT+07:00</li><li>GMT+08:00</li><li>GMT+09:00</li><li>GMT+09:30</li><li>GMT+10:00</li><li>GMT+10:30</li><li>GMT+11:00</li><li>GMT+11:30</li><li>GMT+12:00</li><li>GMT+12:45</li><li>GMT+13:00</li><li>GMT+14:00</li><li>UTC-11:00</li><li>UTC-10:00</li><li>UTC-09:00</li><li>UTC-08:00</li><li>UTC-12:00</li><li>UTC-07:00</li><li>UTC-06:00</li><li>UTC-05:00</li><li>UTC-04:30</li><li>UTC-04:00</li><li>UTC-03:30</li><li>UTC-03:00</li><li>UTC-02:00</li><li>UTC-01:00</li><li>UTC+00:00</li><li>UTC+01:00</li><li>UTC+02:00</li><li>UTC+03:00</li><li>UTC+03:30</li><li>UTC+04:00</li><li>UTC+04:30</li><li>UTC+05:00</li><li>UTC+05:45</li><li>UTC+06:00</li><li>UTC+06:30</li><li>UTC+07:00</li><li>UTC+08:00</li><li>UTC+09:00</li><li>UTC+09:30</li><li>UTC+10:00</li><li>UTC+11:00</li><li>UTC+12:00</li><li>UTC+13:00</li></ul>
     */
    public void setTimeZone(String TimeZone) {
        this.TimeZone = TimeZone;
    }

    /**
     * Get <p>Pre-filtering process - filter out original data written to COS</p> 
     * @return DSLFilter <p>Pre-filtering process - filter out original data written to COS</p>
     */
    public String getDSLFilter() {
        return this.DSLFilter;
    }

    /**
     * Set <p>Pre-filtering process - filter out original data written to COS</p>
     * @param DSLFilter <p>Pre-filtering process - filter out original data written to COS</p>
     */
    public void setDSLFilter(String DSLFilter) {
        this.DSLFilter = DSLFilter;
    }

    public ModifyShipperRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyShipperRequest(ModifyShipperRequest source) {
        if (source.ShipperId != null) {
            this.ShipperId = new String(source.ShipperId);
        }
        if (source.Bucket != null) {
            this.Bucket = new String(source.Bucket);
        }
        if (source.Prefix != null) {
            this.Prefix = new String(source.Prefix);
        }
        if (source.Status != null) {
            this.Status = new Boolean(source.Status);
        }
        if (source.ShipperName != null) {
            this.ShipperName = new String(source.ShipperName);
        }
        if (source.Interval != null) {
            this.Interval = new Long(source.Interval);
        }
        if (source.MaxSize != null) {
            this.MaxSize = new Long(source.MaxSize);
        }
        if (source.FilterRules != null) {
            this.FilterRules = new FilterRuleInfo[source.FilterRules.length];
            for (int i = 0; i < source.FilterRules.length; i++) {
                this.FilterRules[i] = new FilterRuleInfo(source.FilterRules[i]);
            }
        }
        if (source.Partition != null) {
            this.Partition = new String(source.Partition);
        }
        if (source.Compress != null) {
            this.Compress = new CompressInfo(source.Compress);
        }
        if (source.Content != null) {
            this.Content = new ContentInfo(source.Content);
        }
        if (source.FilenameMode != null) {
            this.FilenameMode = new Long(source.FilenameMode);
        }
        if (source.StorageType != null) {
            this.StorageType = new String(source.StorageType);
        }
        if (source.RoleArn != null) {
            this.RoleArn = new String(source.RoleArn);
        }
        if (source.ExternalId != null) {
            this.ExternalId = new String(source.ExternalId);
        }
        if (source.TimeZone != null) {
            this.TimeZone = new String(source.TimeZone);
        }
        if (source.DSLFilter != null) {
            this.DSLFilter = new String(source.DSLFilter);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ShipperId", this.ShipperId);
        this.setParamSimple(map, prefix + "Bucket", this.Bucket);
        this.setParamSimple(map, prefix + "Prefix", this.Prefix);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "ShipperName", this.ShipperName);
        this.setParamSimple(map, prefix + "Interval", this.Interval);
        this.setParamSimple(map, prefix + "MaxSize", this.MaxSize);
        this.setParamArrayObj(map, prefix + "FilterRules.", this.FilterRules);
        this.setParamSimple(map, prefix + "Partition", this.Partition);
        this.setParamObj(map, prefix + "Compress.", this.Compress);
        this.setParamObj(map, prefix + "Content.", this.Content);
        this.setParamSimple(map, prefix + "FilenameMode", this.FilenameMode);
        this.setParamSimple(map, prefix + "StorageType", this.StorageType);
        this.setParamSimple(map, prefix + "RoleArn", this.RoleArn);
        this.setParamSimple(map, prefix + "ExternalId", this.ExternalId);
        this.setParamSimple(map, prefix + "TimeZone", this.TimeZone);
        this.setParamSimple(map, prefix + "DSLFilter", this.DSLFilter);

    }
}

