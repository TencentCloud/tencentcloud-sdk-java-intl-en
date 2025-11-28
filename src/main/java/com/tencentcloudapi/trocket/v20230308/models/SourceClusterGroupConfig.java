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
package com.tencentcloudapi.trocket.v20230308.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SourceClusterGroupConfig extends AbstractModel {

    /**
    * Consumer group name. It can be obtained from [SourceClusterGroupConfig](https://www.tencentcloud.comom/document/api/1493/96031?from_cn_redirect=1#SourceClusterGroupConfig) returned by the API [DescribeSourceClusterGroupList](https://www.tencentcloud.comom/document/api/1493/118006?from_cn_redirect=1).
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("GroupName")
    @Expose
    private String GroupName;

    /**
    * Remarks

Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * Specifies whether it has been imported. it is unavailable when used as an input parameter.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Imported")
    @Expose
    private Boolean Imported;

    /**
    * Namespace, valid for 4.x clusters only.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Namespace")
    @Expose
    private String Namespace;

    /**
    * Import status.
Unknown. specifies an unknown status.
Success.
Failure.
AlreadyExists. specifies the resource already exists.

Used as an output parameter.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ImportStatus")
    @Expose
    private String ImportStatus;

    /**
    * Namespace of 4.x. output usage.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("NamespaceV4")
    @Expose
    private String NamespaceV4;

    /**
    * Consumer group name for version 4.x. output usage.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("GroupNameV4")
    @Expose
    private String GroupNameV4;

    /**
    * Complete namespace for version 4.x. output usage.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("FullNamespaceV4")
    @Expose
    private String FullNamespaceV4;

    /**
    * Specifies whether it is ordered delivery. valid value: 5.0.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ConsumeMessageOrderly")
    @Expose
    private Boolean ConsumeMessageOrderly;

    /**
     * Get Consumer group name. It can be obtained from [SourceClusterGroupConfig](https://www.tencentcloud.comom/document/api/1493/96031?from_cn_redirect=1#SourceClusterGroupConfig) returned by the API [DescribeSourceClusterGroupList](https://www.tencentcloud.comom/document/api/1493/118006?from_cn_redirect=1).
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return GroupName Consumer group name. It can be obtained from [SourceClusterGroupConfig](https://www.tencentcloud.comom/document/api/1493/96031?from_cn_redirect=1#SourceClusterGroupConfig) returned by the API [DescribeSourceClusterGroupList](https://www.tencentcloud.comom/document/api/1493/118006?from_cn_redirect=1).
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getGroupName() {
        return this.GroupName;
    }

    /**
     * Set Consumer group name. It can be obtained from [SourceClusterGroupConfig](https://www.tencentcloud.comom/document/api/1493/96031?from_cn_redirect=1#SourceClusterGroupConfig) returned by the API [DescribeSourceClusterGroupList](https://www.tencentcloud.comom/document/api/1493/118006?from_cn_redirect=1).
Note: This field may return null, indicating that no valid values can be obtained.
     * @param GroupName Consumer group name. It can be obtained from [SourceClusterGroupConfig](https://www.tencentcloud.comom/document/api/1493/96031?from_cn_redirect=1#SourceClusterGroupConfig) returned by the API [DescribeSourceClusterGroupList](https://www.tencentcloud.comom/document/api/1493/118006?from_cn_redirect=1).
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setGroupName(String GroupName) {
        this.GroupName = GroupName;
    }

    /**
     * Get Remarks

Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Remark Remarks

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set Remarks

Note: This field may return null, indicating that no valid values can be obtained.
     * @param Remark Remarks

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    /**
     * Get Specifies whether it has been imported. it is unavailable when used as an input parameter.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Imported Specifies whether it has been imported. it is unavailable when used as an input parameter.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Boolean getImported() {
        return this.Imported;
    }

    /**
     * Set Specifies whether it has been imported. it is unavailable when used as an input parameter.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Imported Specifies whether it has been imported. it is unavailable when used as an input parameter.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setImported(Boolean Imported) {
        this.Imported = Imported;
    }

    /**
     * Get Namespace, valid for 4.x clusters only.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Namespace Namespace, valid for 4.x clusters only.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getNamespace() {
        return this.Namespace;
    }

    /**
     * Set Namespace, valid for 4.x clusters only.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Namespace Namespace, valid for 4.x clusters only.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setNamespace(String Namespace) {
        this.Namespace = Namespace;
    }

    /**
     * Get Import status.
Unknown. specifies an unknown status.
Success.
Failure.
AlreadyExists. specifies the resource already exists.

Used as an output parameter.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ImportStatus Import status.
Unknown. specifies an unknown status.
Success.
Failure.
AlreadyExists. specifies the resource already exists.

Used as an output parameter.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getImportStatus() {
        return this.ImportStatus;
    }

    /**
     * Set Import status.
Unknown. specifies an unknown status.
Success.
Failure.
AlreadyExists. specifies the resource already exists.

Used as an output parameter.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ImportStatus Import status.
Unknown. specifies an unknown status.
Success.
Failure.
AlreadyExists. specifies the resource already exists.

Used as an output parameter.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setImportStatus(String ImportStatus) {
        this.ImportStatus = ImportStatus;
    }

    /**
     * Get Namespace of 4.x. output usage.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return NamespaceV4 Namespace of 4.x. output usage.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getNamespaceV4() {
        return this.NamespaceV4;
    }

    /**
     * Set Namespace of 4.x. output usage.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param NamespaceV4 Namespace of 4.x. output usage.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setNamespaceV4(String NamespaceV4) {
        this.NamespaceV4 = NamespaceV4;
    }

    /**
     * Get Consumer group name for version 4.x. output usage.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return GroupNameV4 Consumer group name for version 4.x. output usage.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getGroupNameV4() {
        return this.GroupNameV4;
    }

    /**
     * Set Consumer group name for version 4.x. output usage.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param GroupNameV4 Consumer group name for version 4.x. output usage.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setGroupNameV4(String GroupNameV4) {
        this.GroupNameV4 = GroupNameV4;
    }

    /**
     * Get Complete namespace for version 4.x. output usage.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return FullNamespaceV4 Complete namespace for version 4.x. output usage.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getFullNamespaceV4() {
        return this.FullNamespaceV4;
    }

    /**
     * Set Complete namespace for version 4.x. output usage.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param FullNamespaceV4 Complete namespace for version 4.x. output usage.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setFullNamespaceV4(String FullNamespaceV4) {
        this.FullNamespaceV4 = FullNamespaceV4;
    }

    /**
     * Get Specifies whether it is ordered delivery. valid value: 5.0.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ConsumeMessageOrderly Specifies whether it is ordered delivery. valid value: 5.0.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Boolean getConsumeMessageOrderly() {
        return this.ConsumeMessageOrderly;
    }

    /**
     * Set Specifies whether it is ordered delivery. valid value: 5.0.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ConsumeMessageOrderly Specifies whether it is ordered delivery. valid value: 5.0.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setConsumeMessageOrderly(Boolean ConsumeMessageOrderly) {
        this.ConsumeMessageOrderly = ConsumeMessageOrderly;
    }

    public SourceClusterGroupConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SourceClusterGroupConfig(SourceClusterGroupConfig source) {
        if (source.GroupName != null) {
            this.GroupName = new String(source.GroupName);
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
        if (source.Imported != null) {
            this.Imported = new Boolean(source.Imported);
        }
        if (source.Namespace != null) {
            this.Namespace = new String(source.Namespace);
        }
        if (source.ImportStatus != null) {
            this.ImportStatus = new String(source.ImportStatus);
        }
        if (source.NamespaceV4 != null) {
            this.NamespaceV4 = new String(source.NamespaceV4);
        }
        if (source.GroupNameV4 != null) {
            this.GroupNameV4 = new String(source.GroupNameV4);
        }
        if (source.FullNamespaceV4 != null) {
            this.FullNamespaceV4 = new String(source.FullNamespaceV4);
        }
        if (source.ConsumeMessageOrderly != null) {
            this.ConsumeMessageOrderly = new Boolean(source.ConsumeMessageOrderly);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "GroupName", this.GroupName);
        this.setParamSimple(map, prefix + "Remark", this.Remark);
        this.setParamSimple(map, prefix + "Imported", this.Imported);
        this.setParamSimple(map, prefix + "Namespace", this.Namespace);
        this.setParamSimple(map, prefix + "ImportStatus", this.ImportStatus);
        this.setParamSimple(map, prefix + "NamespaceV4", this.NamespaceV4);
        this.setParamSimple(map, prefix + "GroupNameV4", this.GroupNameV4);
        this.setParamSimple(map, prefix + "FullNamespaceV4", this.FullNamespaceV4);
        this.setParamSimple(map, prefix + "ConsumeMessageOrderly", this.ConsumeMessageOrderly);

    }
}

