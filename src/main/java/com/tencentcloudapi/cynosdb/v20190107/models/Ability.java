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
package com.tencentcloudapi.cynosdb.v20190107.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Ability extends AbstractModel {

    /**
    * <p>Whether support from availability zone is supported</p>
    */
    @SerializedName("IsSupportSlaveZone")
    @Expose
    private String IsSupportSlaveZone;

    /**
    * <p>The causes for no support from availability zone</p>
    */
    @SerializedName("NonsupportSlaveZoneReason")
    @Expose
    private String NonsupportSlaveZoneReason;

    /**
    * <p>Whether RO instance is supported</p>
    */
    @SerializedName("IsSupportRo")
    @Expose
    private String IsSupportRo;

    /**
    * <p>Reason for unsupported RO instance</p>
    */
    @SerializedName("NonsupportRoReason")
    @Expose
    private String NonsupportRoReason;

    /**
    * <p>Whether manual snapshot backup initiation is supported</p>
    */
    @SerializedName("IsSupportManualSnapshot")
    @Expose
    private String IsSupportManualSnapshot;

    /**
    * <p>Whether transparent data encryption is supported</p>
    */
    @SerializedName("IsSupportTransparentDataEncryption")
    @Expose
    private String IsSupportTransparentDataEncryption;

    /**
    * <p>The causes for unsupported transparent data encryption</p>
    */
    @SerializedName("NoSupportTransparentDataEncryptionReason")
    @Expose
    private String NoSupportTransparentDataEncryptionReason;

    /**
    * <p>Whether manual initiation of logical backup is supported</p>
    */
    @SerializedName("IsSupportManualLogic")
    @Expose
    private String IsSupportManualLogic;

    /**
    * <p>Whether global encryption can be enabled</p>
    */
    @SerializedName("IsSupportGlobalEncryption")
    @Expose
    private String IsSupportGlobalEncryption;

    /**
    * <p>The causes for unsupported global encryption</p>
    */
    @SerializedName("NoSupportGlobalEncryptionReason")
    @Expose
    private String NoSupportGlobalEncryptionReason;

    /**
    * <p>Status code for unsupported transparent encryption reason</p>
    */
    @SerializedName("NoSupportTransparentDataEncryptionReasonCode")
    @Expose
    private String NoSupportTransparentDataEncryptionReasonCode;

    /**
    * <p>Status code for unsupported global encryption reason</p>
    */
    @SerializedName("NoSupportGlobalEncryptionReasonCode")
    @Expose
    private String NoSupportGlobalEncryptionReasonCode;

    /**
     * Get <p>Whether support from availability zone is supported</p> 
     * @return IsSupportSlaveZone <p>Whether support from availability zone is supported</p>
     */
    public String getIsSupportSlaveZone() {
        return this.IsSupportSlaveZone;
    }

    /**
     * Set <p>Whether support from availability zone is supported</p>
     * @param IsSupportSlaveZone <p>Whether support from availability zone is supported</p>
     */
    public void setIsSupportSlaveZone(String IsSupportSlaveZone) {
        this.IsSupportSlaveZone = IsSupportSlaveZone;
    }

    /**
     * Get <p>The causes for no support from availability zone</p> 
     * @return NonsupportSlaveZoneReason <p>The causes for no support from availability zone</p>
     */
    public String getNonsupportSlaveZoneReason() {
        return this.NonsupportSlaveZoneReason;
    }

    /**
     * Set <p>The causes for no support from availability zone</p>
     * @param NonsupportSlaveZoneReason <p>The causes for no support from availability zone</p>
     */
    public void setNonsupportSlaveZoneReason(String NonsupportSlaveZoneReason) {
        this.NonsupportSlaveZoneReason = NonsupportSlaveZoneReason;
    }

    /**
     * Get <p>Whether RO instance is supported</p> 
     * @return IsSupportRo <p>Whether RO instance is supported</p>
     */
    public String getIsSupportRo() {
        return this.IsSupportRo;
    }

    /**
     * Set <p>Whether RO instance is supported</p>
     * @param IsSupportRo <p>Whether RO instance is supported</p>
     */
    public void setIsSupportRo(String IsSupportRo) {
        this.IsSupportRo = IsSupportRo;
    }

    /**
     * Get <p>Reason for unsupported RO instance</p> 
     * @return NonsupportRoReason <p>Reason for unsupported RO instance</p>
     */
    public String getNonsupportRoReason() {
        return this.NonsupportRoReason;
    }

    /**
     * Set <p>Reason for unsupported RO instance</p>
     * @param NonsupportRoReason <p>Reason for unsupported RO instance</p>
     */
    public void setNonsupportRoReason(String NonsupportRoReason) {
        this.NonsupportRoReason = NonsupportRoReason;
    }

    /**
     * Get <p>Whether manual snapshot backup initiation is supported</p> 
     * @return IsSupportManualSnapshot <p>Whether manual snapshot backup initiation is supported</p>
     */
    public String getIsSupportManualSnapshot() {
        return this.IsSupportManualSnapshot;
    }

    /**
     * Set <p>Whether manual snapshot backup initiation is supported</p>
     * @param IsSupportManualSnapshot <p>Whether manual snapshot backup initiation is supported</p>
     */
    public void setIsSupportManualSnapshot(String IsSupportManualSnapshot) {
        this.IsSupportManualSnapshot = IsSupportManualSnapshot;
    }

    /**
     * Get <p>Whether transparent data encryption is supported</p> 
     * @return IsSupportTransparentDataEncryption <p>Whether transparent data encryption is supported</p>
     */
    public String getIsSupportTransparentDataEncryption() {
        return this.IsSupportTransparentDataEncryption;
    }

    /**
     * Set <p>Whether transparent data encryption is supported</p>
     * @param IsSupportTransparentDataEncryption <p>Whether transparent data encryption is supported</p>
     */
    public void setIsSupportTransparentDataEncryption(String IsSupportTransparentDataEncryption) {
        this.IsSupportTransparentDataEncryption = IsSupportTransparentDataEncryption;
    }

    /**
     * Get <p>The causes for unsupported transparent data encryption</p> 
     * @return NoSupportTransparentDataEncryptionReason <p>The causes for unsupported transparent data encryption</p>
     */
    public String getNoSupportTransparentDataEncryptionReason() {
        return this.NoSupportTransparentDataEncryptionReason;
    }

    /**
     * Set <p>The causes for unsupported transparent data encryption</p>
     * @param NoSupportTransparentDataEncryptionReason <p>The causes for unsupported transparent data encryption</p>
     */
    public void setNoSupportTransparentDataEncryptionReason(String NoSupportTransparentDataEncryptionReason) {
        this.NoSupportTransparentDataEncryptionReason = NoSupportTransparentDataEncryptionReason;
    }

    /**
     * Get <p>Whether manual initiation of logical backup is supported</p> 
     * @return IsSupportManualLogic <p>Whether manual initiation of logical backup is supported</p>
     */
    public String getIsSupportManualLogic() {
        return this.IsSupportManualLogic;
    }

    /**
     * Set <p>Whether manual initiation of logical backup is supported</p>
     * @param IsSupportManualLogic <p>Whether manual initiation of logical backup is supported</p>
     */
    public void setIsSupportManualLogic(String IsSupportManualLogic) {
        this.IsSupportManualLogic = IsSupportManualLogic;
    }

    /**
     * Get <p>Whether global encryption can be enabled</p> 
     * @return IsSupportGlobalEncryption <p>Whether global encryption can be enabled</p>
     */
    public String getIsSupportGlobalEncryption() {
        return this.IsSupportGlobalEncryption;
    }

    /**
     * Set <p>Whether global encryption can be enabled</p>
     * @param IsSupportGlobalEncryption <p>Whether global encryption can be enabled</p>
     */
    public void setIsSupportGlobalEncryption(String IsSupportGlobalEncryption) {
        this.IsSupportGlobalEncryption = IsSupportGlobalEncryption;
    }

    /**
     * Get <p>The causes for unsupported global encryption</p> 
     * @return NoSupportGlobalEncryptionReason <p>The causes for unsupported global encryption</p>
     */
    public String getNoSupportGlobalEncryptionReason() {
        return this.NoSupportGlobalEncryptionReason;
    }

    /**
     * Set <p>The causes for unsupported global encryption</p>
     * @param NoSupportGlobalEncryptionReason <p>The causes for unsupported global encryption</p>
     */
    public void setNoSupportGlobalEncryptionReason(String NoSupportGlobalEncryptionReason) {
        this.NoSupportGlobalEncryptionReason = NoSupportGlobalEncryptionReason;
    }

    /**
     * Get <p>Status code for unsupported transparent encryption reason</p> 
     * @return NoSupportTransparentDataEncryptionReasonCode <p>Status code for unsupported transparent encryption reason</p>
     */
    public String getNoSupportTransparentDataEncryptionReasonCode() {
        return this.NoSupportTransparentDataEncryptionReasonCode;
    }

    /**
     * Set <p>Status code for unsupported transparent encryption reason</p>
     * @param NoSupportTransparentDataEncryptionReasonCode <p>Status code for unsupported transparent encryption reason</p>
     */
    public void setNoSupportTransparentDataEncryptionReasonCode(String NoSupportTransparentDataEncryptionReasonCode) {
        this.NoSupportTransparentDataEncryptionReasonCode = NoSupportTransparentDataEncryptionReasonCode;
    }

    /**
     * Get <p>Status code for unsupported global encryption reason</p> 
     * @return NoSupportGlobalEncryptionReasonCode <p>Status code for unsupported global encryption reason</p>
     */
    public String getNoSupportGlobalEncryptionReasonCode() {
        return this.NoSupportGlobalEncryptionReasonCode;
    }

    /**
     * Set <p>Status code for unsupported global encryption reason</p>
     * @param NoSupportGlobalEncryptionReasonCode <p>Status code for unsupported global encryption reason</p>
     */
    public void setNoSupportGlobalEncryptionReasonCode(String NoSupportGlobalEncryptionReasonCode) {
        this.NoSupportGlobalEncryptionReasonCode = NoSupportGlobalEncryptionReasonCode;
    }

    public Ability() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Ability(Ability source) {
        if (source.IsSupportSlaveZone != null) {
            this.IsSupportSlaveZone = new String(source.IsSupportSlaveZone);
        }
        if (source.NonsupportSlaveZoneReason != null) {
            this.NonsupportSlaveZoneReason = new String(source.NonsupportSlaveZoneReason);
        }
        if (source.IsSupportRo != null) {
            this.IsSupportRo = new String(source.IsSupportRo);
        }
        if (source.NonsupportRoReason != null) {
            this.NonsupportRoReason = new String(source.NonsupportRoReason);
        }
        if (source.IsSupportManualSnapshot != null) {
            this.IsSupportManualSnapshot = new String(source.IsSupportManualSnapshot);
        }
        if (source.IsSupportTransparentDataEncryption != null) {
            this.IsSupportTransparentDataEncryption = new String(source.IsSupportTransparentDataEncryption);
        }
        if (source.NoSupportTransparentDataEncryptionReason != null) {
            this.NoSupportTransparentDataEncryptionReason = new String(source.NoSupportTransparentDataEncryptionReason);
        }
        if (source.IsSupportManualLogic != null) {
            this.IsSupportManualLogic = new String(source.IsSupportManualLogic);
        }
        if (source.IsSupportGlobalEncryption != null) {
            this.IsSupportGlobalEncryption = new String(source.IsSupportGlobalEncryption);
        }
        if (source.NoSupportGlobalEncryptionReason != null) {
            this.NoSupportGlobalEncryptionReason = new String(source.NoSupportGlobalEncryptionReason);
        }
        if (source.NoSupportTransparentDataEncryptionReasonCode != null) {
            this.NoSupportTransparentDataEncryptionReasonCode = new String(source.NoSupportTransparentDataEncryptionReasonCode);
        }
        if (source.NoSupportGlobalEncryptionReasonCode != null) {
            this.NoSupportGlobalEncryptionReasonCode = new String(source.NoSupportGlobalEncryptionReasonCode);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "IsSupportSlaveZone", this.IsSupportSlaveZone);
        this.setParamSimple(map, prefix + "NonsupportSlaveZoneReason", this.NonsupportSlaveZoneReason);
        this.setParamSimple(map, prefix + "IsSupportRo", this.IsSupportRo);
        this.setParamSimple(map, prefix + "NonsupportRoReason", this.NonsupportRoReason);
        this.setParamSimple(map, prefix + "IsSupportManualSnapshot", this.IsSupportManualSnapshot);
        this.setParamSimple(map, prefix + "IsSupportTransparentDataEncryption", this.IsSupportTransparentDataEncryption);
        this.setParamSimple(map, prefix + "NoSupportTransparentDataEncryptionReason", this.NoSupportTransparentDataEncryptionReason);
        this.setParamSimple(map, prefix + "IsSupportManualLogic", this.IsSupportManualLogic);
        this.setParamSimple(map, prefix + "IsSupportGlobalEncryption", this.IsSupportGlobalEncryption);
        this.setParamSimple(map, prefix + "NoSupportGlobalEncryptionReason", this.NoSupportGlobalEncryptionReason);
        this.setParamSimple(map, prefix + "NoSupportTransparentDataEncryptionReasonCode", this.NoSupportTransparentDataEncryptionReasonCode);
        this.setParamSimple(map, prefix + "NoSupportGlobalEncryptionReasonCode", this.NoSupportGlobalEncryptionReasonCode);

    }
}

