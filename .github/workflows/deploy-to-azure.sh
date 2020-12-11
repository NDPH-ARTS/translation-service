docker login azure --client-id=1f9cdde8-8413-4fcd-9c2e-b769339d11cc --client-secret=e.onW6lTp_AdtjjmilW.necv8fSv8sonLP --tenant-id=5bb8abc0-9dbd-4705-b679-23e3270bce26
az group create -n "validate-pr-${CI_REF_SLUG}" -l uksouth
docker context create aci ${CI_REF_SLUG} --resource-group "validate-pr-${CI_REF_SLUG}" --location uksouth --subscription-id afaf9fb4-a9ae-4d88-8339-d36461cd89df
docker context use ${CI_REF_SLUG}
docker compose up
