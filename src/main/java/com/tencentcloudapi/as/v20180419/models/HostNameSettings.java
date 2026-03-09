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
package com.tencentcloudapi.as.v20180419.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class HostNameSettings extends AbstractModel {

    /**
    * Specifies the cvm hostname.
<li>Dots (.) and hyphens (-) cannot be used as the first or last character of HostName, and cannot be used consecutively.</li>. 
<Li>Windows instances are not supported.</li>. 
<li>Instances of other types (such as Linux): specifies the character length should be within the range of [2, 42]. multiple dots (.) are allowed. each segment between dots can consist of letters (case-insensitive), digits, and hyphens (-). using only digits is not allowed.</li>. 
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("HostName")
    @Expose
    private String HostName;

    /**
    * The style of the CVM HostName. Valid values include ORIGINAL and UNIQUE, and the default value is ORIGINAL.
<li>ORIGINAL: AS passes HostName filled in the input parameters to CVM. CVM may append serial numbers to HostName, which can result in conflicts with HostName of instances in the scaling group.</li>
<li> UNIQUE: HostName filled in the input parameters acts as a prefix for the HostName. AS and CVM will expand this prefix to ensure that HostName of the instance in the scaling group is unique.</li>
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("HostNameStyle")
    @Expose
    private String HostNameStyle;

    /**
    * Specifies the hostname suffix for cvm.
<li>Dots (.) and hyphens (-) cannot be used as the last character of HostNameSuffix, and cannot be used consecutively.</li>
<Li>Windows instances are not supported.</li>
<li>Instances of other types (such as Linux): The character length should be within the range of [1, 39], and the combined length with HostName cannot exceed 41. Multiple dots (.) are allowed. each segment between dots can consist of letters (case-insensitive), digits, and hyphens (-).</li>
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("HostNameSuffix")
    @Expose
    private String HostNameSuffix;

    /**
    * Specifies the delimiter for the CVM host name. The default delimiter is a dot (.). Valid values: 
- dot (.)
-  hyphen (-)
- empty string.
Delimiter used for concatenating host name, index, and suffix. Assuming host name is testGpu4090, index is 0007, and suffix is server.
-The delimiter is a period (.), and the final concatenation is testGpu4090.007.server.
-Specifies the delimiter as a hyphen (-), with the final concatenation as testGpu4090-007-server.
-Delimiter is an empty string, finally concatenated as testGpu4090007server.
    */
    @SerializedName("HostNameDelimiter")
    @Expose
    private String HostNameDelimiter;

    /**
     * Get Specifies the cvm hostname.
<li>Dots (.) and hyphens (-) cannot be used as the first or last character of HostName, and cannot be used consecutively.</li>. 
<Li>Windows instances are not supported.</li>. 
<li>Instances of other types (such as Linux): specifies the character length should be within the range of [2, 42]. multiple dots (.) are allowed. each segment between dots can consist of letters (case-insensitive), digits, and hyphens (-). using only digits is not allowed.</li>. 
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return HostName Specifies the cvm hostname.
<li>Dots (.) and hyphens (-) cannot be used as the first or last character of HostName, and cannot be used consecutively.</li>. 
<Li>Windows instances are not supported.</li>. 
<li>Instances of other types (such as Linux): specifies the character length should be within the range of [2, 42]. multiple dots (.) are allowed. each segment between dots can consist of letters (case-insensitive), digits, and hyphens (-). using only digits is not allowed.</li>. 
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getHostName() {
        return this.HostName;
    }

    /**
     * Set Specifies the cvm hostname.
<li>Dots (.) and hyphens (-) cannot be used as the first or last character of HostName, and cannot be used consecutively.</li>. 
<Li>Windows instances are not supported.</li>. 
<li>Instances of other types (such as Linux): specifies the character length should be within the range of [2, 42]. multiple dots (.) are allowed. each segment between dots can consist of letters (case-insensitive), digits, and hyphens (-). using only digits is not allowed.</li>. 
Note: This field may return null, indicating that no valid values can be obtained.
     * @param HostName Specifies the cvm hostname.
<li>Dots (.) and hyphens (-) cannot be used as the first or last character of HostName, and cannot be used consecutively.</li>. 
<Li>Windows instances are not supported.</li>. 
<li>Instances of other types (such as Linux): specifies the character length should be within the range of [2, 42]. multiple dots (.) are allowed. each segment between dots can consist of letters (case-insensitive), digits, and hyphens (-). using only digits is not allowed.</li>. 
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setHostName(String HostName) {
        this.HostName = HostName;
    }

    /**
     * Get The style of the CVM HostName. Valid values include ORIGINAL and UNIQUE, and the default value is ORIGINAL.
<li>ORIGINAL: AS passes HostName filled in the input parameters to CVM. CVM may append serial numbers to HostName, which can result in conflicts with HostName of instances in the scaling group.</li>
<li> UNIQUE: HostName filled in the input parameters acts as a prefix for the HostName. AS and CVM will expand this prefix to ensure that HostName of the instance in the scaling group is unique.</li>
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return HostNameStyle The style of the CVM HostName. Valid values include ORIGINAL and UNIQUE, and the default value is ORIGINAL.
<li>ORIGINAL: AS passes HostName filled in the input parameters to CVM. CVM may append serial numbers to HostName, which can result in conflicts with HostName of instances in the scaling group.</li>
<li> UNIQUE: HostName filled in the input parameters acts as a prefix for the HostName. AS and CVM will expand this prefix to ensure that HostName of the instance in the scaling group is unique.</li>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getHostNameStyle() {
        return this.HostNameStyle;
    }

    /**
     * Set The style of the CVM HostName. Valid values include ORIGINAL and UNIQUE, and the default value is ORIGINAL.
<li>ORIGINAL: AS passes HostName filled in the input parameters to CVM. CVM may append serial numbers to HostName, which can result in conflicts with HostName of instances in the scaling group.</li>
<li> UNIQUE: HostName filled in the input parameters acts as a prefix for the HostName. AS and CVM will expand this prefix to ensure that HostName of the instance in the scaling group is unique.</li>
Note: This field may return null, indicating that no valid values can be obtained.
     * @param HostNameStyle The style of the CVM HostName. Valid values include ORIGINAL and UNIQUE, and the default value is ORIGINAL.
<li>ORIGINAL: AS passes HostName filled in the input parameters to CVM. CVM may append serial numbers to HostName, which can result in conflicts with HostName of instances in the scaling group.</li>
<li> UNIQUE: HostName filled in the input parameters acts as a prefix for the HostName. AS and CVM will expand this prefix to ensure that HostName of the instance in the scaling group is unique.</li>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setHostNameStyle(String HostNameStyle) {
        this.HostNameStyle = HostNameStyle;
    }

    /**
     * Get Specifies the hostname suffix for cvm.
<li>Dots (.) and hyphens (-) cannot be used as the last character of HostNameSuffix, and cannot be used consecutively.</li>
<Li>Windows instances are not supported.</li>
<li>Instances of other types (such as Linux): The character length should be within the range of [1, 39], and the combined length with HostName cannot exceed 41. Multiple dots (.) are allowed. each segment between dots can consist of letters (case-insensitive), digits, and hyphens (-).</li>
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return HostNameSuffix Specifies the hostname suffix for cvm.
<li>Dots (.) and hyphens (-) cannot be used as the last character of HostNameSuffix, and cannot be used consecutively.</li>
<Li>Windows instances are not supported.</li>
<li>Instances of other types (such as Linux): The character length should be within the range of [1, 39], and the combined length with HostName cannot exceed 41. Multiple dots (.) are allowed. each segment between dots can consist of letters (case-insensitive), digits, and hyphens (-).</li>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getHostNameSuffix() {
        return this.HostNameSuffix;
    }

    /**
     * Set Specifies the hostname suffix for cvm.
<li>Dots (.) and hyphens (-) cannot be used as the last character of HostNameSuffix, and cannot be used consecutively.</li>
<Li>Windows instances are not supported.</li>
<li>Instances of other types (such as Linux): The character length should be within the range of [1, 39], and the combined length with HostName cannot exceed 41. Multiple dots (.) are allowed. each segment between dots can consist of letters (case-insensitive), digits, and hyphens (-).</li>
Note: This field may return null, indicating that no valid values can be obtained.
     * @param HostNameSuffix Specifies the hostname suffix for cvm.
<li>Dots (.) and hyphens (-) cannot be used as the last character of HostNameSuffix, and cannot be used consecutively.</li>
<Li>Windows instances are not supported.</li>
<li>Instances of other types (such as Linux): The character length should be within the range of [1, 39], and the combined length with HostName cannot exceed 41. Multiple dots (.) are allowed. each segment between dots can consist of letters (case-insensitive), digits, and hyphens (-).</li>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setHostNameSuffix(String HostNameSuffix) {
        this.HostNameSuffix = HostNameSuffix;
    }

    /**
     * Get Specifies the delimiter for the CVM host name. The default delimiter is a dot (.). Valid values: 
- dot (.)
-  hyphen (-)
- empty string.
Delimiter used for concatenating host name, index, and suffix. Assuming host name is testGpu4090, index is 0007, and suffix is server.
-The delimiter is a period (.), and the final concatenation is testGpu4090.007.server.
-Specifies the delimiter as a hyphen (-), with the final concatenation as testGpu4090-007-server.
-Delimiter is an empty string, finally concatenated as testGpu4090007server. 
     * @return HostNameDelimiter Specifies the delimiter for the CVM host name. The default delimiter is a dot (.). Valid values: 
- dot (.)
-  hyphen (-)
- empty string.
Delimiter used for concatenating host name, index, and suffix. Assuming host name is testGpu4090, index is 0007, and suffix is server.
-The delimiter is a period (.), and the final concatenation is testGpu4090.007.server.
-Specifies the delimiter as a hyphen (-), with the final concatenation as testGpu4090-007-server.
-Delimiter is an empty string, finally concatenated as testGpu4090007server.
     */
    public String getHostNameDelimiter() {
        return this.HostNameDelimiter;
    }

    /**
     * Set Specifies the delimiter for the CVM host name. The default delimiter is a dot (.). Valid values: 
- dot (.)
-  hyphen (-)
- empty string.
Delimiter used for concatenating host name, index, and suffix. Assuming host name is testGpu4090, index is 0007, and suffix is server.
-The delimiter is a period (.), and the final concatenation is testGpu4090.007.server.
-Specifies the delimiter as a hyphen (-), with the final concatenation as testGpu4090-007-server.
-Delimiter is an empty string, finally concatenated as testGpu4090007server.
     * @param HostNameDelimiter Specifies the delimiter for the CVM host name. The default delimiter is a dot (.). Valid values: 
- dot (.)
-  hyphen (-)
- empty string.
Delimiter used for concatenating host name, index, and suffix. Assuming host name is testGpu4090, index is 0007, and suffix is server.
-The delimiter is a period (.), and the final concatenation is testGpu4090.007.server.
-Specifies the delimiter as a hyphen (-), with the final concatenation as testGpu4090-007-server.
-Delimiter is an empty string, finally concatenated as testGpu4090007server.
     */
    public void setHostNameDelimiter(String HostNameDelimiter) {
        this.HostNameDelimiter = HostNameDelimiter;
    }

    public HostNameSettings() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public HostNameSettings(HostNameSettings source) {
        if (source.HostName != null) {
            this.HostName = new String(source.HostName);
        }
        if (source.HostNameStyle != null) {
            this.HostNameStyle = new String(source.HostNameStyle);
        }
        if (source.HostNameSuffix != null) {
            this.HostNameSuffix = new String(source.HostNameSuffix);
        }
        if (source.HostNameDelimiter != null) {
            this.HostNameDelimiter = new String(source.HostNameDelimiter);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "HostName", this.HostName);
        this.setParamSimple(map, prefix + "HostNameStyle", this.HostNameStyle);
        this.setParamSimple(map, prefix + "HostNameSuffix", this.HostNameSuffix);
        this.setParamSimple(map, prefix + "HostNameDelimiter", this.HostNameDelimiter);

    }
}

