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
package com.tencentcloudapi.teo.v20220901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DenyActionParameters extends AbstractModel {

    /**
    * Specifies whether to extend the ban on the source IP. valid values.
<li>`on`: Enable;</li>

<li>off: Disable.</li>

After enabled, continuously blocks client ips that trigger the rule. when this option is enabled, the BlockIpDuration parameter must be simultaneously designated.
Note: this option cannot intersect with ReturnCustomPage or Stall.
    */
    @SerializedName("BlockIp")
    @Expose
    private String BlockIp;

    /**
    * The ban duration when BlockIP is on.
    */
    @SerializedName("BlockIpDuration")
    @Expose
    private String BlockIpDuration;

    /**
    * Specifies whether to use a custom page. valid values:.
<li>`on`: Enable;</li>

<li>off: Disable.</li>

Enabled, use custom page content to intercept requests. when this option is enabled, ResponseCode and ErrorPageId parameters must be specified simultaneously.
Note: this option cannot intersect with the BlockIp or Stall option.

    */
    @SerializedName("ReturnCustomPage")
    @Expose
    private String ReturnCustomPage;

    /**
    * Status code of the custom page.
    */
    @SerializedName("ResponseCode")
    @Expose
    private String ResponseCode;

    /**
    * Specifies the page id of the custom page.
    */
    @SerializedName("ErrorPageId")
    @Expose
    private String ErrorPageId;

    /**
    * Specifies whether to suspend the request source without processing. valid values:.
<li>`on`: Enable;</li>

<li>off: Disable.</li>

Enabled, no longer responds to requests in the current connection session and does not actively disconnect. used for crawler combat to consume client connection resources.
Note: this option cannot intersect with BlockIp or ReturnCustomPage options.
    */
    @SerializedName("Stall")
    @Expose
    private String Stall;

    /**
     * Get Specifies whether to extend the ban on the source IP. valid values.
<li>`on`: Enable;</li>

<li>off: Disable.</li>

After enabled, continuously blocks client ips that trigger the rule. when this option is enabled, the BlockIpDuration parameter must be simultaneously designated.
Note: this option cannot intersect with ReturnCustomPage or Stall. 
     * @return BlockIp Specifies whether to extend the ban on the source IP. valid values.
<li>`on`: Enable;</li>

<li>off: Disable.</li>

After enabled, continuously blocks client ips that trigger the rule. when this option is enabled, the BlockIpDuration parameter must be simultaneously designated.
Note: this option cannot intersect with ReturnCustomPage or Stall.
     */
    public String getBlockIp() {
        return this.BlockIp;
    }

    /**
     * Set Specifies whether to extend the ban on the source IP. valid values.
<li>`on`: Enable;</li>

<li>off: Disable.</li>

After enabled, continuously blocks client ips that trigger the rule. when this option is enabled, the BlockIpDuration parameter must be simultaneously designated.
Note: this option cannot intersect with ReturnCustomPage or Stall.
     * @param BlockIp Specifies whether to extend the ban on the source IP. valid values.
<li>`on`: Enable;</li>

<li>off: Disable.</li>

After enabled, continuously blocks client ips that trigger the rule. when this option is enabled, the BlockIpDuration parameter must be simultaneously designated.
Note: this option cannot intersect with ReturnCustomPage or Stall.
     */
    public void setBlockIp(String BlockIp) {
        this.BlockIp = BlockIp;
    }

    /**
     * Get The ban duration when BlockIP is on. 
     * @return BlockIpDuration The ban duration when BlockIP is on.
     */
    public String getBlockIpDuration() {
        return this.BlockIpDuration;
    }

    /**
     * Set The ban duration when BlockIP is on.
     * @param BlockIpDuration The ban duration when BlockIP is on.
     */
    public void setBlockIpDuration(String BlockIpDuration) {
        this.BlockIpDuration = BlockIpDuration;
    }

    /**
     * Get Specifies whether to use a custom page. valid values:.
<li>`on`: Enable;</li>

<li>off: Disable.</li>

Enabled, use custom page content to intercept requests. when this option is enabled, ResponseCode and ErrorPageId parameters must be specified simultaneously.
Note: this option cannot intersect with the BlockIp or Stall option.
 
     * @return ReturnCustomPage Specifies whether to use a custom page. valid values:.
<li>`on`: Enable;</li>

<li>off: Disable.</li>

Enabled, use custom page content to intercept requests. when this option is enabled, ResponseCode and ErrorPageId parameters must be specified simultaneously.
Note: this option cannot intersect with the BlockIp or Stall option.

     */
    public String getReturnCustomPage() {
        return this.ReturnCustomPage;
    }

    /**
     * Set Specifies whether to use a custom page. valid values:.
<li>`on`: Enable;</li>

<li>off: Disable.</li>

Enabled, use custom page content to intercept requests. when this option is enabled, ResponseCode and ErrorPageId parameters must be specified simultaneously.
Note: this option cannot intersect with the BlockIp or Stall option.

     * @param ReturnCustomPage Specifies whether to use a custom page. valid values:.
<li>`on`: Enable;</li>

<li>off: Disable.</li>

Enabled, use custom page content to intercept requests. when this option is enabled, ResponseCode and ErrorPageId parameters must be specified simultaneously.
Note: this option cannot intersect with the BlockIp or Stall option.

     */
    public void setReturnCustomPage(String ReturnCustomPage) {
        this.ReturnCustomPage = ReturnCustomPage;
    }

    /**
     * Get Status code of the custom page. 
     * @return ResponseCode Status code of the custom page.
     */
    public String getResponseCode() {
        return this.ResponseCode;
    }

    /**
     * Set Status code of the custom page.
     * @param ResponseCode Status code of the custom page.
     */
    public void setResponseCode(String ResponseCode) {
        this.ResponseCode = ResponseCode;
    }

    /**
     * Get Specifies the page id of the custom page. 
     * @return ErrorPageId Specifies the page id of the custom page.
     */
    public String getErrorPageId() {
        return this.ErrorPageId;
    }

    /**
     * Set Specifies the page id of the custom page.
     * @param ErrorPageId Specifies the page id of the custom page.
     */
    public void setErrorPageId(String ErrorPageId) {
        this.ErrorPageId = ErrorPageId;
    }

    /**
     * Get Specifies whether to suspend the request source without processing. valid values:.
<li>`on`: Enable;</li>

<li>off: Disable.</li>

Enabled, no longer responds to requests in the current connection session and does not actively disconnect. used for crawler combat to consume client connection resources.
Note: this option cannot intersect with BlockIp or ReturnCustomPage options. 
     * @return Stall Specifies whether to suspend the request source without processing. valid values:.
<li>`on`: Enable;</li>

<li>off: Disable.</li>

Enabled, no longer responds to requests in the current connection session and does not actively disconnect. used for crawler combat to consume client connection resources.
Note: this option cannot intersect with BlockIp or ReturnCustomPage options.
     */
    public String getStall() {
        return this.Stall;
    }

    /**
     * Set Specifies whether to suspend the request source without processing. valid values:.
<li>`on`: Enable;</li>

<li>off: Disable.</li>

Enabled, no longer responds to requests in the current connection session and does not actively disconnect. used for crawler combat to consume client connection resources.
Note: this option cannot intersect with BlockIp or ReturnCustomPage options.
     * @param Stall Specifies whether to suspend the request source without processing. valid values:.
<li>`on`: Enable;</li>

<li>off: Disable.</li>

Enabled, no longer responds to requests in the current connection session and does not actively disconnect. used for crawler combat to consume client connection resources.
Note: this option cannot intersect with BlockIp or ReturnCustomPage options.
     */
    public void setStall(String Stall) {
        this.Stall = Stall;
    }

    public DenyActionParameters() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DenyActionParameters(DenyActionParameters source) {
        if (source.BlockIp != null) {
            this.BlockIp = new String(source.BlockIp);
        }
        if (source.BlockIpDuration != null) {
            this.BlockIpDuration = new String(source.BlockIpDuration);
        }
        if (source.ReturnCustomPage != null) {
            this.ReturnCustomPage = new String(source.ReturnCustomPage);
        }
        if (source.ResponseCode != null) {
            this.ResponseCode = new String(source.ResponseCode);
        }
        if (source.ErrorPageId != null) {
            this.ErrorPageId = new String(source.ErrorPageId);
        }
        if (source.Stall != null) {
            this.Stall = new String(source.Stall);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "BlockIp", this.BlockIp);
        this.setParamSimple(map, prefix + "BlockIpDuration", this.BlockIpDuration);
        this.setParamSimple(map, prefix + "ReturnCustomPage", this.ReturnCustomPage);
        this.setParamSimple(map, prefix + "ResponseCode", this.ResponseCode);
        this.setParamSimple(map, prefix + "ErrorPageId", this.ErrorPageId);
        this.setParamSimple(map, prefix + "Stall", this.Stall);

    }
}

