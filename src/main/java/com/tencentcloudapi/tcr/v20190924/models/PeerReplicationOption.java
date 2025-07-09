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
package com.tencentcloudapi.tcr.v20190924.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class PeerReplicationOption extends AbstractModel {

    /**
    * UIN of the destination instance
    */
    @SerializedName("PeerRegistryUin")
    @Expose
    private String PeerRegistryUin;

    /**
    * Permanent access Token for the destination instance
    */
    @SerializedName("PeerRegistryToken")
    @Expose
    private String PeerRegistryToken;

    /**
    * Whether to enable cross-account synchronization
    */
    @SerializedName("EnablePeerReplication")
    @Expose
    private Boolean EnablePeerReplication;

    /**
     * Get UIN of the destination instance 
     * @return PeerRegistryUin UIN of the destination instance
     */
    public String getPeerRegistryUin() {
        return this.PeerRegistryUin;
    }

    /**
     * Set UIN of the destination instance
     * @param PeerRegistryUin UIN of the destination instance
     */
    public void setPeerRegistryUin(String PeerRegistryUin) {
        this.PeerRegistryUin = PeerRegistryUin;
    }

    /**
     * Get Permanent access Token for the destination instance 
     * @return PeerRegistryToken Permanent access Token for the destination instance
     */
    public String getPeerRegistryToken() {
        return this.PeerRegistryToken;
    }

    /**
     * Set Permanent access Token for the destination instance
     * @param PeerRegistryToken Permanent access Token for the destination instance
     */
    public void setPeerRegistryToken(String PeerRegistryToken) {
        this.PeerRegistryToken = PeerRegistryToken;
    }

    /**
     * Get Whether to enable cross-account synchronization 
     * @return EnablePeerReplication Whether to enable cross-account synchronization
     */
    public Boolean getEnablePeerReplication() {
        return this.EnablePeerReplication;
    }

    /**
     * Set Whether to enable cross-account synchronization
     * @param EnablePeerReplication Whether to enable cross-account synchronization
     */
    public void setEnablePeerReplication(Boolean EnablePeerReplication) {
        this.EnablePeerReplication = EnablePeerReplication;
    }

    public PeerReplicationOption() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PeerReplicationOption(PeerReplicationOption source) {
        if (source.PeerRegistryUin != null) {
            this.PeerRegistryUin = new String(source.PeerRegistryUin);
        }
        if (source.PeerRegistryToken != null) {
            this.PeerRegistryToken = new String(source.PeerRegistryToken);
        }
        if (source.EnablePeerReplication != null) {
            this.EnablePeerReplication = new Boolean(source.EnablePeerReplication);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PeerRegistryUin", this.PeerRegistryUin);
        this.setParamSimple(map, prefix + "PeerRegistryToken", this.PeerRegistryToken);
        this.setParamSimple(map, prefix + "EnablePeerReplication", this.EnablePeerReplication);

    }
}

