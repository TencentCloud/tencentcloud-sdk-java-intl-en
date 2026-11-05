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
    * Whether to extend the block on the source IP. Valid values:
<li>`on`: Enable;</li>
<li>off: Disable.</li>
After enabled, the client IP that triggers the rule will be continuously blocked. When this option is enabled, the BlockIpDuration parameter must be specified simultaneously.
Note: This option cannot intersect with ReturnCustomPage or Stall.
    */
    @SerializedName("BlockIp")
    @Expose
    private String BlockIp;

    /**
    * IP ban duration when BlockIP is on.
    */
    @SerializedName("BlockIpDuration")
    @Expose
    private String BlockIpDuration;

    /**
    * Whether to use custom pages. Valid values:
<li>`on`: Enable;</li>
<li>off: Disable.</li>
Enabled. Use custom page content to intercept (respond to) requests. When this option is enabled, you must specify the ResponseCode and ErrorPageId parameters simultaneously.
Note: This option cannot intersect with BlockIp or Stall.

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
    * PageId of the custom page.
    */
    @SerializedName("ErrorPageId")
    @Expose
    private String ErrorPageId;

    /**
    * Whether to suspend requests from the request source without processing. Valid values:
<li>`on`: Enable;</li>
<li>off: Disable.</li>
Enabled. It no longer responds to requests in the current connection session and does not actively disconnect. When used for crawler counteraction, it consumes client connection resources.
Note: This option cannot intersect with BlockIp or ReturnCustomPage.
    */
    @SerializedName("Stall")
    @Expose
    private String Stall;

    /**
     * Get Whether to extend the block on the source IP. Valid values:
<li>`on`: Enable;</li>
<li>off: Disable.</li>
After enabled, the client IP that triggers the rule will be continuously blocked. When this option is enabled, the BlockIpDuration parameter must be specified simultaneously.
Note: This option cannot intersect with ReturnCustomPage or Stall. 
     * @return BlockIp Whether to extend the block on the source IP. Valid values:
<li>`on`: Enable;</li>
<li>off: Disable.</li>
After enabled, the client IP that triggers the rule will be continuously blocked. When this option is enabled, the BlockIpDuration parameter must be specified simultaneously.
Note: This option cannot intersect with ReturnCustomPage or Stall.
     */
    public String getBlockIp() {
        return this.BlockIp;
    }

    /**
     * Set Whether to extend the block on the source IP. Valid values:
<li>`on`: Enable;</li>
<li>off: Disable.</li>
After enabled, the client IP that triggers the rule will be continuously blocked. When this option is enabled, the BlockIpDuration parameter must be specified simultaneously.
Note: This option cannot intersect with ReturnCustomPage or Stall.
     * @param BlockIp Whether to extend the block on the source IP. Valid values:
<li>`on`: Enable;</li>
<li>off: Disable.</li>
After enabled, the client IP that triggers the rule will be continuously blocked. When this option is enabled, the BlockIpDuration parameter must be specified simultaneously.
Note: This option cannot intersect with ReturnCustomPage or Stall.
     */
    public void setBlockIp(String BlockIp) {
        this.BlockIp = BlockIp;
    }

    /**
     * Get IP ban duration when BlockIP is on. 
     * @return BlockIpDuration IP ban duration when BlockIP is on.
     */
    public String getBlockIpDuration() {
        return this.BlockIpDuration;
    }

    /**
     * Set IP ban duration when BlockIP is on.
     * @param BlockIpDuration IP ban duration when BlockIP is on.
     */
    public void setBlockIpDuration(String BlockIpDuration) {
        this.BlockIpDuration = BlockIpDuration;
    }

    /**
     * Get Whether to use custom pages. Valid values:
<li>`on`: Enable;</li>
<li>off: Disable.</li>
Enabled. Use custom page content to intercept (respond to) requests. When this option is enabled, you must specify the ResponseCode and ErrorPageId parameters simultaneously.
Note: This option cannot intersect with BlockIp or Stall.
 
     * @return ReturnCustomPage Whether to use custom pages. Valid values:
<li>`on`: Enable;</li>
<li>off: Disable.</li>
Enabled. Use custom page content to intercept (respond to) requests. When this option is enabled, you must specify the ResponseCode and ErrorPageId parameters simultaneously.
Note: This option cannot intersect with BlockIp or Stall.

     */
    public String getReturnCustomPage() {
        return this.ReturnCustomPage;
    }

    /**
     * Set Whether to use custom pages. Valid values:
<li>`on`: Enable;</li>
<li>off: Disable.</li>
Enabled. Use custom page content to intercept (respond to) requests. When this option is enabled, you must specify the ResponseCode and ErrorPageId parameters simultaneously.
Note: This option cannot intersect with BlockIp or Stall.

     * @param ReturnCustomPage Whether to use custom pages. Valid values:
<li>`on`: Enable;</li>
<li>off: Disable.</li>
Enabled. Use custom page content to intercept (respond to) requests. When this option is enabled, you must specify the ResponseCode and ErrorPageId parameters simultaneously.
Note: This option cannot intersect with BlockIp or Stall.

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
     * Get PageId of the custom page. 
     * @return ErrorPageId PageId of the custom page.
     */
    public String getErrorPageId() {
        return this.ErrorPageId;
    }

    /**
     * Set PageId of the custom page.
     * @param ErrorPageId PageId of the custom page.
     */
    public void setErrorPageId(String ErrorPageId) {
        this.ErrorPageId = ErrorPageId;
    }

    /**
     * Get Whether to suspend requests from the request source without processing. Valid values:
<li>`on`: Enable;</li>
<li>off: Disable.</li>
Enabled. It no longer responds to requests in the current connection session and does not actively disconnect. When used for crawler counteraction, it consumes client connection resources.
Note: This option cannot intersect with BlockIp or ReturnCustomPage. 
     * @return Stall Whether to suspend requests from the request source without processing. Valid values:
<li>`on`: Enable;</li>
<li>off: Disable.</li>
Enabled. It no longer responds to requests in the current connection session and does not actively disconnect. When used for crawler counteraction, it consumes client connection resources.
Note: This option cannot intersect with BlockIp or ReturnCustomPage.
     */
    public String getStall() {
        return this.Stall;
    }

    /**
     * Set Whether to suspend requests from the request source without processing. Valid values:
<li>`on`: Enable;</li>
<li>off: Disable.</li>
Enabled. It no longer responds to requests in the current connection session and does not actively disconnect. When used for crawler counteraction, it consumes client connection resources.
Note: This option cannot intersect with BlockIp or ReturnCustomPage.
     * @param Stall Whether to suspend requests from the request source without processing. Valid values:
<li>`on`: Enable;</li>
<li>off: Disable.</li>
Enabled. It no longer responds to requests in the current connection session and does not actively disconnect. When used for crawler counteraction, it consumes client connection resources.
Note: This option cannot intersect with BlockIp or ReturnCustomPage.
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

