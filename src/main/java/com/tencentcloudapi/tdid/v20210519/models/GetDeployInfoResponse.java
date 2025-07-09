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
package com.tencentcloudapi.tdid.v20210519.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class GetDeployInfoResponse extends AbstractModel {

    /**
    * The CNS address of the contract.
    */
    @SerializedName("Hash")
    @Expose
    private String Hash;

    /**
    * The main group ID of the contract.
    */
    @SerializedName("GroupId")
    @Expose
    private String GroupId;

    /**
    * The DID of the organization that deployed the contract.
    */
    @SerializedName("DeployDid")
    @Expose
    private String DeployDid;

    /**
    * The TDID SDK version.
    */
    @SerializedName("SdkVersion")
    @Expose
    private String SdkVersion;

    /**
    * The TDID contract version.
    */
    @SerializedName("ContractVersion")
    @Expose
    private String ContractVersion;

    /**
    * The blockchain node version.
    */
    @SerializedName("BlockVersion")
    @Expose
    private String BlockVersion;

    /**
    * The IP address of the blockchain node.
    */
    @SerializedName("BlockIp")
    @Expose
    private String BlockIp;

    /**
    * The address of the DID contract.
    */
    @SerializedName("DidAddress")
    @Expose
    private String DidAddress;

    /**
    * The address of the claim protocol type (CPT) contract.
    */
    @SerializedName("CptAddress")
    @Expose
    private String CptAddress;

    /**
    * The address of the authority.
    */
    @SerializedName("AuthorityAddress")
    @Expose
    private String AuthorityAddress;

    /**
    * The evidence contract address.
    */
    @SerializedName("EvidenceAddress")
    @Expose
    private String EvidenceAddress;

    /**
    * The contract address of the specific issuer.
    */
    @SerializedName("SpecificAddress")
    @Expose
    private String SpecificAddress;

    /**
    * The chain ID.
    */
    @SerializedName("ChainId")
    @Expose
    private String ChainId;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get The CNS address of the contract. 
     * @return Hash The CNS address of the contract.
     */
    public String getHash() {
        return this.Hash;
    }

    /**
     * Set The CNS address of the contract.
     * @param Hash The CNS address of the contract.
     */
    public void setHash(String Hash) {
        this.Hash = Hash;
    }

    /**
     * Get The main group ID of the contract. 
     * @return GroupId The main group ID of the contract.
     */
    public String getGroupId() {
        return this.GroupId;
    }

    /**
     * Set The main group ID of the contract.
     * @param GroupId The main group ID of the contract.
     */
    public void setGroupId(String GroupId) {
        this.GroupId = GroupId;
    }

    /**
     * Get The DID of the organization that deployed the contract. 
     * @return DeployDid The DID of the organization that deployed the contract.
     */
    public String getDeployDid() {
        return this.DeployDid;
    }

    /**
     * Set The DID of the organization that deployed the contract.
     * @param DeployDid The DID of the organization that deployed the contract.
     */
    public void setDeployDid(String DeployDid) {
        this.DeployDid = DeployDid;
    }

    /**
     * Get The TDID SDK version. 
     * @return SdkVersion The TDID SDK version.
     */
    public String getSdkVersion() {
        return this.SdkVersion;
    }

    /**
     * Set The TDID SDK version.
     * @param SdkVersion The TDID SDK version.
     */
    public void setSdkVersion(String SdkVersion) {
        this.SdkVersion = SdkVersion;
    }

    /**
     * Get The TDID contract version. 
     * @return ContractVersion The TDID contract version.
     */
    public String getContractVersion() {
        return this.ContractVersion;
    }

    /**
     * Set The TDID contract version.
     * @param ContractVersion The TDID contract version.
     */
    public void setContractVersion(String ContractVersion) {
        this.ContractVersion = ContractVersion;
    }

    /**
     * Get The blockchain node version. 
     * @return BlockVersion The blockchain node version.
     */
    public String getBlockVersion() {
        return this.BlockVersion;
    }

    /**
     * Set The blockchain node version.
     * @param BlockVersion The blockchain node version.
     */
    public void setBlockVersion(String BlockVersion) {
        this.BlockVersion = BlockVersion;
    }

    /**
     * Get The IP address of the blockchain node. 
     * @return BlockIp The IP address of the blockchain node.
     */
    public String getBlockIp() {
        return this.BlockIp;
    }

    /**
     * Set The IP address of the blockchain node.
     * @param BlockIp The IP address of the blockchain node.
     */
    public void setBlockIp(String BlockIp) {
        this.BlockIp = BlockIp;
    }

    /**
     * Get The address of the DID contract. 
     * @return DidAddress The address of the DID contract.
     */
    public String getDidAddress() {
        return this.DidAddress;
    }

    /**
     * Set The address of the DID contract.
     * @param DidAddress The address of the DID contract.
     */
    public void setDidAddress(String DidAddress) {
        this.DidAddress = DidAddress;
    }

    /**
     * Get The address of the claim protocol type (CPT) contract. 
     * @return CptAddress The address of the claim protocol type (CPT) contract.
     */
    public String getCptAddress() {
        return this.CptAddress;
    }

    /**
     * Set The address of the claim protocol type (CPT) contract.
     * @param CptAddress The address of the claim protocol type (CPT) contract.
     */
    public void setCptAddress(String CptAddress) {
        this.CptAddress = CptAddress;
    }

    /**
     * Get The address of the authority. 
     * @return AuthorityAddress The address of the authority.
     */
    public String getAuthorityAddress() {
        return this.AuthorityAddress;
    }

    /**
     * Set The address of the authority.
     * @param AuthorityAddress The address of the authority.
     */
    public void setAuthorityAddress(String AuthorityAddress) {
        this.AuthorityAddress = AuthorityAddress;
    }

    /**
     * Get The evidence contract address. 
     * @return EvidenceAddress The evidence contract address.
     */
    public String getEvidenceAddress() {
        return this.EvidenceAddress;
    }

    /**
     * Set The evidence contract address.
     * @param EvidenceAddress The evidence contract address.
     */
    public void setEvidenceAddress(String EvidenceAddress) {
        this.EvidenceAddress = EvidenceAddress;
    }

    /**
     * Get The contract address of the specific issuer. 
     * @return SpecificAddress The contract address of the specific issuer.
     */
    public String getSpecificAddress() {
        return this.SpecificAddress;
    }

    /**
     * Set The contract address of the specific issuer.
     * @param SpecificAddress The contract address of the specific issuer.
     */
    public void setSpecificAddress(String SpecificAddress) {
        this.SpecificAddress = SpecificAddress;
    }

    /**
     * Get The chain ID. 
     * @return ChainId The chain ID.
     */
    public String getChainId() {
        return this.ChainId;
    }

    /**
     * Set The chain ID.
     * @param ChainId The chain ID.
     */
    public void setChainId(String ChainId) {
        this.ChainId = ChainId;
    }

    /**
     * Get The unique request ID, which is returned for each request. RequestId is required for locating a problem. 
     * @return RequestId The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     * @param RequestId The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public GetDeployInfoResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GetDeployInfoResponse(GetDeployInfoResponse source) {
        if (source.Hash != null) {
            this.Hash = new String(source.Hash);
        }
        if (source.GroupId != null) {
            this.GroupId = new String(source.GroupId);
        }
        if (source.DeployDid != null) {
            this.DeployDid = new String(source.DeployDid);
        }
        if (source.SdkVersion != null) {
            this.SdkVersion = new String(source.SdkVersion);
        }
        if (source.ContractVersion != null) {
            this.ContractVersion = new String(source.ContractVersion);
        }
        if (source.BlockVersion != null) {
            this.BlockVersion = new String(source.BlockVersion);
        }
        if (source.BlockIp != null) {
            this.BlockIp = new String(source.BlockIp);
        }
        if (source.DidAddress != null) {
            this.DidAddress = new String(source.DidAddress);
        }
        if (source.CptAddress != null) {
            this.CptAddress = new String(source.CptAddress);
        }
        if (source.AuthorityAddress != null) {
            this.AuthorityAddress = new String(source.AuthorityAddress);
        }
        if (source.EvidenceAddress != null) {
            this.EvidenceAddress = new String(source.EvidenceAddress);
        }
        if (source.SpecificAddress != null) {
            this.SpecificAddress = new String(source.SpecificAddress);
        }
        if (source.ChainId != null) {
            this.ChainId = new String(source.ChainId);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Hash", this.Hash);
        this.setParamSimple(map, prefix + "GroupId", this.GroupId);
        this.setParamSimple(map, prefix + "DeployDid", this.DeployDid);
        this.setParamSimple(map, prefix + "SdkVersion", this.SdkVersion);
        this.setParamSimple(map, prefix + "ContractVersion", this.ContractVersion);
        this.setParamSimple(map, prefix + "BlockVersion", this.BlockVersion);
        this.setParamSimple(map, prefix + "BlockIp", this.BlockIp);
        this.setParamSimple(map, prefix + "DidAddress", this.DidAddress);
        this.setParamSimple(map, prefix + "CptAddress", this.CptAddress);
        this.setParamSimple(map, prefix + "AuthorityAddress", this.AuthorityAddress);
        this.setParamSimple(map, prefix + "EvidenceAddress", this.EvidenceAddress);
        this.setParamSimple(map, prefix + "SpecificAddress", this.SpecificAddress);
        this.setParamSimple(map, prefix + "ChainId", this.ChainId);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

