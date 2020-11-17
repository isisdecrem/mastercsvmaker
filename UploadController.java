@RequestMapping(value = "/upload", method = RequestMethod.POST)
public void UploadReceipts(@RequestParam("files[]") List<MultipartFile> file) throws Exception {
    logger.info(" Inside the upload receipts method "+file.size());
    for(int i=0; i< file.size(); i++)
    {
        if(!file.get(i).isEmpty())
        {
            CommonsMultipartFile cm = (CommonsMultipartFile) file.get(i);
            logger.info(" Inside the file upload method "+cm.getOriginalFilename());
            simpleUploadService.uploadFileandSaveReceipt(cm);
        }
    }   
}
