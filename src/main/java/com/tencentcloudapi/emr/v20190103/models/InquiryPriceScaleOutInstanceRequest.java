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
package com.tencentcloudapi.emr.v20190103.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class InquiryPriceScaleOutInstanceRequest extends AbstractModel {

    /**
    * <p>Time unit for the scale-out. Valid values:</p><li>s: indicates seconds. When PayMode is set to 0, TimeUnit can only be set to s.</li><li>m: indicates months. When PayMode is set to 1, TimeUnit can only be set to m.</li>
    */
    @SerializedName("TimeUnit")
    @Expose
    private String TimeUnit;

    /**
    * <p>Scale-out duration, which is used together with TimeUnit.</p><li>When TimeUnit is set to s, this parameter can only be set to 3600, indicating a pay-as-you-go instance.</li><li>When TimeUnit is set to m, the value set for this parameter indicates the subscription duration of the instance. For example, 1 indicates a one-month subscription.</li>
    */
    @SerializedName("TimeSpan")
    @Expose
    private Long TimeSpan;

    /**
    * <p>ID of the AZ to which the instance belongs, for example, 100003. This parameter can be obtained from the ZoneId field in the response of <a href="https://www.tencentcloud.com/document/api/213/15707?from_cn_redirect=1">DescribeZones</a>.</p>
    */
    @SerializedName("ZoneId")
    @Expose
    private Long ZoneId;

    /**
    * <p>Instance billing mode. Valid values:</p><li>0: pay-as-you-go</li><li>1: yearly/monthly subscription</li>
    */
    @SerializedName("PayMode")
    @Expose
    private Long PayMode;

    /**
    * <p>Instance ID.</p>
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * <p>Number of Core nodes to be scaled out.</p>
    */
    @SerializedName("CoreCount")
    @Expose
    private Long CoreCount;

    /**
    * <p>Number of Task nodes to be scaled out.</p>
    */
    @SerializedName("TaskCount")
    @Expose
    private Long TaskCount;

    /**
    * <p>Currency type. Valid values:</p><li>CNY: RMB</li>
    */
    @SerializedName("Currency")
    @Expose
    private String Currency;

    /**
    * <p>Number of Router nodes to be scaled out.</p>
    */
    @SerializedName("RouterCount")
    @Expose
    private Long RouterCount;

    /**
    * <p>Number of Master nodes to be scaled out.</p>
    */
    @SerializedName("MasterCount")
    @Expose
    private Long MasterCount;

    /**
    * <p>The type can be ComputeResource, EMR, or a default value. The default value is EMR.</p>
    */
    @SerializedName("ResourceBaseType")
    @Expose
    private String ResourceBaseType;

    /**
    * <p>Computing resource ID.</p>
    */
    @SerializedName("ComputeResourceId")
    @Expose
    private String ComputeResourceId;

    /**
    * <p>Scale-out resource type.</p>
    */
    @SerializedName("HardwareResourceType")
    @Expose
    private String HardwareResourceType;

    /**
    * <p>Node group ID.</p>
    */
    @SerializedName("NodeGroupId")
    @Expose
    private String NodeGroupId;

    /**
     * Get <p>Time unit for the scale-out. Valid values:</p><li>s: indicates seconds. When PayMode is set to 0, TimeUnit can only be set to s.</li><li>m: indicates months. When PayMode is set to 1, TimeUnit can only be set to m.</li> 
     * @return TimeUnit <p>Time unit for the scale-out. Valid values:</p><li>s: indicates seconds. When PayMode is set to 0, TimeUnit can only be set to s.</li><li>m: indicates months. When PayMode is set to 1, TimeUnit can only be set to m.</li>
     */
    public String getTimeUnit() {
        return this.TimeUnit;
    }

    /**
     * Set <p>Time unit for the scale-out. Valid values:</p><li>s: indicates seconds. When PayMode is set to 0, TimeUnit can only be set to s.</li><li>m: indicates months. When PayMode is set to 1, TimeUnit can only be set to m.</li>
     * @param TimeUnit <p>Time unit for the scale-out. Valid values:</p><li>s: indicates seconds. When PayMode is set to 0, TimeUnit can only be set to s.</li><li>m: indicates months. When PayMode is set to 1, TimeUnit can only be set to m.</li>
     */
    public void setTimeUnit(String TimeUnit) {
        this.TimeUnit = TimeUnit;
    }

    /**
     * Get <p>Scale-out duration, which is used together with TimeUnit.</p><li>When TimeUnit is set to s, this parameter can only be set to 3600, indicating a pay-as-you-go instance.</li><li>When TimeUnit is set to m, the value set for this parameter indicates the subscription duration of the instance. For example, 1 indicates a one-month subscription.</li> 
     * @return TimeSpan <p>Scale-out duration, which is used together with TimeUnit.</p><li>When TimeUnit is set to s, this parameter can only be set to 3600, indicating a pay-as-you-go instance.</li><li>When TimeUnit is set to m, the value set for this parameter indicates the subscription duration of the instance. For example, 1 indicates a one-month subscription.</li>
     */
    public Long getTimeSpan() {
        return this.TimeSpan;
    }

    /**
     * Set <p>Scale-out duration, which is used together with TimeUnit.</p><li>When TimeUnit is set to s, this parameter can only be set to 3600, indicating a pay-as-you-go instance.</li><li>When TimeUnit is set to m, the value set for this parameter indicates the subscription duration of the instance. For example, 1 indicates a one-month subscription.</li>
     * @param TimeSpan <p>Scale-out duration, which is used together with TimeUnit.</p><li>When TimeUnit is set to s, this parameter can only be set to 3600, indicating a pay-as-you-go instance.</li><li>When TimeUnit is set to m, the value set for this parameter indicates the subscription duration of the instance. For example, 1 indicates a one-month subscription.</li>
     */
    public void setTimeSpan(Long TimeSpan) {
        this.TimeSpan = TimeSpan;
    }

    /**
     * Get <p>ID of the AZ to which the instance belongs, for example, 100003. This parameter can be obtained from the ZoneId field in the response of <a href="https://www.tencentcloud.com/document/api/213/15707?from_cn_redirect=1">DescribeZones</a>.</p> 
     * @return ZoneId <p>ID of the AZ to which the instance belongs, for example, 100003. This parameter can be obtained from the ZoneId field in the response of <a href="https://www.tencentcloud.com/document/api/213/15707?from_cn_redirect=1">DescribeZones</a>.</p>
     */
    public Long getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set <p>ID of the AZ to which the instance belongs, for example, 100003. This parameter can be obtained from the ZoneId field in the response of <a href="https://www.tencentcloud.com/document/api/213/15707?from_cn_redirect=1">DescribeZones</a>.</p>
     * @param ZoneId <p>ID of the AZ to which the instance belongs, for example, 100003. This parameter can be obtained from the ZoneId field in the response of <a href="https://www.tencentcloud.com/document/api/213/15707?from_cn_redirect=1">DescribeZones</a>.</p>
     */
    public void setZoneId(Long ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get <p>Instance billing mode. Valid values:</p><li>0: pay-as-you-go</li><li>1: yearly/monthly subscription</li> 
     * @return PayMode <p>Instance billing mode. Valid values:</p><li>0: pay-as-you-go</li><li>1: yearly/monthly subscription</li>
     */
    public Long getPayMode() {
        return this.PayMode;
    }

    /**
     * Set <p>Instance billing mode. Valid values:</p><li>0: pay-as-you-go</li><li>1: yearly/monthly subscription</li>
     * @param PayMode <p>Instance billing mode. Valid values:</p><li>0: pay-as-you-go</li><li>1: yearly/monthly subscription</li>
     */
    public void setPayMode(Long PayMode) {
        this.PayMode = PayMode;
    }

    /**
     * Get <p>Instance ID.</p> 
     * @return InstanceId <p>Instance ID.</p>
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set <p>Instance ID.</p>
     * @param InstanceId <p>Instance ID.</p>
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get <p>Number of Core nodes to be scaled out.</p> 
     * @return CoreCount <p>Number of Core nodes to be scaled out.</p>
     */
    public Long getCoreCount() {
        return this.CoreCount;
    }

    /**
     * Set <p>Number of Core nodes to be scaled out.</p>
     * @param CoreCount <p>Number of Core nodes to be scaled out.</p>
     */
    public void setCoreCount(Long CoreCount) {
        this.CoreCount = CoreCount;
    }

    /**
     * Get <p>Number of Task nodes to be scaled out.</p> 
     * @return TaskCount <p>Number of Task nodes to be scaled out.</p>
     */
    public Long getTaskCount() {
        return this.TaskCount;
    }

    /**
     * Set <p>Number of Task nodes to be scaled out.</p>
     * @param TaskCount <p>Number of Task nodes to be scaled out.</p>
     */
    public void setTaskCount(Long TaskCount) {
        this.TaskCount = TaskCount;
    }

    /**
     * Get <p>Currency type. Valid values:</p><li>CNY: RMB</li> 
     * @return Currency <p>Currency type. Valid values:</p><li>CNY: RMB</li>
     */
    public String getCurrency() {
        return this.Currency;
    }

    /**
     * Set <p>Currency type. Valid values:</p><li>CNY: RMB</li>
     * @param Currency <p>Currency type. Valid values:</p><li>CNY: RMB</li>
     */
    public void setCurrency(String Currency) {
        this.Currency = Currency;
    }

    /**
     * Get <p>Number of Router nodes to be scaled out.</p> 
     * @return RouterCount <p>Number of Router nodes to be scaled out.</p>
     */
    public Long getRouterCount() {
        return this.RouterCount;
    }

    /**
     * Set <p>Number of Router nodes to be scaled out.</p>
     * @param RouterCount <p>Number of Router nodes to be scaled out.</p>
     */
    public void setRouterCount(Long RouterCount) {
        this.RouterCount = RouterCount;
    }

    /**
     * Get <p>Number of Master nodes to be scaled out.</p> 
     * @return MasterCount <p>Number of Master nodes to be scaled out.</p>
     */
    public Long getMasterCount() {
        return this.MasterCount;
    }

    /**
     * Set <p>Number of Master nodes to be scaled out.</p>
     * @param MasterCount <p>Number of Master nodes to be scaled out.</p>
     */
    public void setMasterCount(Long MasterCount) {
        this.MasterCount = MasterCount;
    }

    /**
     * Get <p>The type can be ComputeResource, EMR, or a default value. The default value is EMR.</p> 
     * @return ResourceBaseType <p>The type can be ComputeResource, EMR, or a default value. The default value is EMR.</p>
     */
    public String getResourceBaseType() {
        return this.ResourceBaseType;
    }

    /**
     * Set <p>The type can be ComputeResource, EMR, or a default value. The default value is EMR.</p>
     * @param ResourceBaseType <p>The type can be ComputeResource, EMR, or a default value. The default value is EMR.</p>
     */
    public void setResourceBaseType(String ResourceBaseType) {
        this.ResourceBaseType = ResourceBaseType;
    }

    /**
     * Get <p>Computing resource ID.</p> 
     * @return ComputeResourceId <p>Computing resource ID.</p>
     */
    public String getComputeResourceId() {
        return this.ComputeResourceId;
    }

    /**
     * Set <p>Computing resource ID.</p>
     * @param ComputeResourceId <p>Computing resource ID.</p>
     */
    public void setComputeResourceId(String ComputeResourceId) {
        this.ComputeResourceId = ComputeResourceId;
    }

    /**
     * Get <p>Scale-out resource type.</p> 
     * @return HardwareResourceType <p>Scale-out resource type.</p>
     */
    public String getHardwareResourceType() {
        return this.HardwareResourceType;
    }

    /**
     * Set <p>Scale-out resource type.</p>
     * @param HardwareResourceType <p>Scale-out resource type.</p>
     */
    public void setHardwareResourceType(String HardwareResourceType) {
        this.HardwareResourceType = HardwareResourceType;
    }

    /**
     * Get <p>Node group ID.</p> 
     * @return NodeGroupId <p>Node group ID.</p>
     */
    public String getNodeGroupId() {
        return this.NodeGroupId;
    }

    /**
     * Set <p>Node group ID.</p>
     * @param NodeGroupId <p>Node group ID.</p>
     */
    public void setNodeGroupId(String NodeGroupId) {
        this.NodeGroupId = NodeGroupId;
    }

    public InquiryPriceScaleOutInstanceRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public InquiryPriceScaleOutInstanceRequest(InquiryPriceScaleOutInstanceRequest source) {
        if (source.TimeUnit != null) {
            this.TimeUnit = new String(source.TimeUnit);
        }
        if (source.TimeSpan != null) {
            this.TimeSpan = new Long(source.TimeSpan);
        }
        if (source.ZoneId != null) {
            this.ZoneId = new Long(source.ZoneId);
        }
        if (source.PayMode != null) {
            this.PayMode = new Long(source.PayMode);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.CoreCount != null) {
            this.CoreCount = new Long(source.CoreCount);
        }
        if (source.TaskCount != null) {
            this.TaskCount = new Long(source.TaskCount);
        }
        if (source.Currency != null) {
            this.Currency = new String(source.Currency);
        }
        if (source.RouterCount != null) {
            this.RouterCount = new Long(source.RouterCount);
        }
        if (source.MasterCount != null) {
            this.MasterCount = new Long(source.MasterCount);
        }
        if (source.ResourceBaseType != null) {
            this.ResourceBaseType = new String(source.ResourceBaseType);
        }
        if (source.ComputeResourceId != null) {
            this.ComputeResourceId = new String(source.ComputeResourceId);
        }
        if (source.HardwareResourceType != null) {
            this.HardwareResourceType = new String(source.HardwareResourceType);
        }
        if (source.NodeGroupId != null) {
            this.NodeGroupId = new String(source.NodeGroupId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TimeUnit", this.TimeUnit);
        this.setParamSimple(map, prefix + "TimeSpan", this.TimeSpan);
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamSimple(map, prefix + "PayMode", this.PayMode);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "CoreCount", this.CoreCount);
        this.setParamSimple(map, prefix + "TaskCount", this.TaskCount);
        this.setParamSimple(map, prefix + "Currency", this.Currency);
        this.setParamSimple(map, prefix + "RouterCount", this.RouterCount);
        this.setParamSimple(map, prefix + "MasterCount", this.MasterCount);
        this.setParamSimple(map, prefix + "ResourceBaseType", this.ResourceBaseType);
        this.setParamSimple(map, prefix + "ComputeResourceId", this.ComputeResourceId);
        this.setParamSimple(map, prefix + "HardwareResourceType", this.HardwareResourceType);
        this.setParamSimple(map, prefix + "NodeGroupId", this.NodeGroupId);

    }
}

